package codegoblin.example.api

data class BlogPost(
    val content: String,
    val timestamp: Long,
    val tags: Collection<String> = emptyList())
