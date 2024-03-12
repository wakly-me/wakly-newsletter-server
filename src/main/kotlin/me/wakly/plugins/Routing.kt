package me.wakly.plugins

import io.ktor.server.application.*
import io.ktor.server.routing.*

import me.wakly.routes.*

fun Application.configureRouting() {
    routing {
        root()
    }
}
