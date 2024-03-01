package ru.btpit.nmedia.dto
data class Post(
    val id: Long,
    val author: String,
    val content: String,
    val published: String,
    var likes: Int = 0,
    var likedByMe: Boolean,
    var shares: Int = 0,
    var sharedByMe: Boolean,
    var viewedByMe: Boolean,
    var viewes: Int = 0,
)

