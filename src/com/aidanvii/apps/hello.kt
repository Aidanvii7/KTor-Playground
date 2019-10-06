@file:JvmName("HelloApp")

package com.aidanvii.apps

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.http.*

fun Application.module() {
    routing {
        get("/") {
            call.respondText("Hello, world!", ContentType.Text.Html)
        }
    }
}