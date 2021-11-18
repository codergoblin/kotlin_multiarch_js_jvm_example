package codegoblin.example.server

import codegoblin.example.api.BlogPost
import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import io.javalin.Javalin
import java.lang.System.currentTimeMillis

fun main() {

    val posts = ArrayList<BlogPost>()

    posts.add(BlogPost("hello world", currentTimeMillis()))

    val mapper = JsonMapper()
    mapper.registerModule(KotlinModule())

    val app: Javalin = Javalin.create().start(8080)
    app.get("/posts/") { it.json(listOf(posts)) }
}