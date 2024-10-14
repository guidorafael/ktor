package com.example.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

import io.ktor.server.html.*
import kotlinx.html.*

//import io.ktor.client.plugins.api.*
import com.example.plugins.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Alo mundo Hello World!")
//            call.respondHtml(HttpStatusCode.OK) {
//                head {
//                    title {
//                        +"html page title"
//                    }
//                }
//                body {
//                    h1 {
//                        +"Hello, user!"
//                    }
//                }
//            }
        }
    }
}
