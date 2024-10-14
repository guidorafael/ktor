package com.example



import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.example.plugins.*
import io.ktor.http.HttpStatusCode
import io.ktor.server.application.*


import io.ktor.server.html.*
import kotlinx.html.*


/**  HTML DEL Templates - ideal para output small HTML page quickly - NOT A LONG - affect readability.
 *
 * To create a template, we need to define a class that inherits from
 * Template<HTML> and override its HTML.apply() method,
 * in which we put our HTML code in HTML DSL.
 *
 */

class MyTemplate : Template<HTML> {
    override fun HTML.apply() {
        body {
            h1 {
                +"Hello, user!"
            }
        }
    }
}

class MyTemplate2() : Template<HTML> {    // esta recebe parametros em Placeholder<FlowContent>
    val name = Placeholder<FlowContent>()
    override fun HTML.apply() {
        body {
            h1 {
                +"Olá template 2 - Hello "
                insert(name)
            }
        }
    }
}

class ChildTemplate() : Template<FlowContent> {
    override fun FlowContent.apply() {
        hr {  }
        div {
            +"Child template"
        }
        hr {  }
    }
}

// Let's pass this template ("3") to our good old MyTemplate. below:

class MyTemplate3() : Template<HTML> {
    val childTemplate = TemplatePlaceholder<ChildTemplate>()
    override fun HTML.apply() {
        body {
            h1 {
                +"Hello "
                insert(ChildTemplate(), childTemplate)
            }
            h2 {
                +"h2 olá  "
                insert(ChildTemplate(), childTemplate)
            }
            h3 {
                +"h3 oi cara pálida  "
                insert(ChildTemplate(), childTemplate)
            }

        }
    }
}

/**
fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureRouting()
}
*/

fun main() {
    embeddedServer(Netty, port = 8080) {       // sem port não fica servindo
        configureRouting()
    }.start(wait = true)  // sem wait = true ele não fica servindo !
}

fun Application.configureRouting() {
    routing {
        get("/") {
            /**call.respondText("Hello hello I dont know why I say hello you say goodbye!") */
            val text = "Bom dia querida Mãesinha"
            call.respondHtml(HttpStatusCode.OK) {
                head {
                    title {
                        +"html page title"
                    }
                }
                body {
                    h1 {
                        +text
                    }
                }
            }
        }
        get("/loop") {
            val comments = mutableListOf("Hello, everyone!", "Great site", "Nice :)", "Viva mamãe", "viva eu viva tudo")
            call.respondHtml(HttpStatusCode.OK) {
                body {
                    ul {
                        for(comment in comments) {
                            li {
                                +comment
                            }
                        }
                    }
                }
            }
        }

        // Next, we can use this template in routing using the call.respondHtmlTemplate function.
        get("/html") {
            call.respondHtmlTemplate(MyTemplate()) {}  // notar {} no final allow you to pass parameters themselves.
        }                                              // vide html2 abaixo

        get("/html2") {
            call.respondHtmlTemplate(MyTemplate2()) {  // notar {} no final allow you to pass parameters themselves.
                name {
                    + "Mundo!"
                }
            }
        }

        /**
         * Child templates - In fact, we can pass not only the parameters to the
         *                   template but also the other templates.
         *
         * Templates that can be passed as parameters to other templates
         * are called child templates.
         * They must inherit from Template<FlowContent> and override FlowContent.apply()
         */

        get("/htmlchild") {
            call.respondHtmlTemplate(MyTemplate3()) {
                childTemplate {}
            }
        }


    }
}

/**
 * Guido - parou em "my template"  https://hyperskill.org/learn/step/20360
 * HTML DSL Templates    https://hyperskill.org/learn/step/20360.
 *
 * continuou com sucesso e ... pensa em escrever em papel para memorizar o aprendizado!
 */

