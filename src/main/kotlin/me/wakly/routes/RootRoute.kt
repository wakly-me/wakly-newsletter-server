package me.wakly.routes

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import me.wakly.services.RootService


fun Route.root() {
    get("/") {
        call.respondText(RootService().test(call.parameters["attr"] ?: "world"))
    }
}
