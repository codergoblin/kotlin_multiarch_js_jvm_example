package codegoblin.example

import kotlinx.browser.document
import kotlinx.browser.window
import org.w3c.dom.WebSocket
import react.dom.div
import react.dom.render

fun main(args: Array<String>) {
    window.onload = {

        val location = window.location;

        var foo = location.host
        if (location.port.isEmpty()) {
            foo += ":${location.port}"
        }
        val endpoint = "ws://$foo/api/ws"

        val webSocket = WebSocket(endpoint)

        val root = document.getElementById("root")!!


        render(root) {
            div {
                +"hello worl"


            }
        }
    }
}