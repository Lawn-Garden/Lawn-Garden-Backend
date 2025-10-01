package org.example.lawngarden.domain.posts.entity

import jakarta.persistence.*
import org.example.lawngarden.domain.users.entity.User
import org.springframework.web.multipart.MultipartFile
import java.time.LocalDate

@Entity
@Table(name = "posts")
class Post(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(nullable = true)
    var link: String? = null,

    @Column(nullable = true)
    var createdDate: LocalDate? = null,

    @Column(nullable = true)
    var updateDate: LocalDate? = null,

    @Column(nullable = true)
    var contents: String? = null,

    @Lob
    @Column(columnDefinition = "LONGBLOB")
    var image: ByteArray,

    @Transient
    var imageFile: MultipartFile? = null,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    var user: User
)
