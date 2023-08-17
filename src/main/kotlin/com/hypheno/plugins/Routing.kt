package com.hypheno.plugins

import com.hypheno.models.TicTacToeGame
import com.hypheno.socket
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting(game: TicTacToeGame) {
    routing {
        socket(game)
    }
}
