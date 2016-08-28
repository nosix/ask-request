package org.anyspirit.webapp.ask.request

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class AskRequestApplication

fun main(args: Array<String>) {
    SpringApplication.run(AskRequestApplication::class.java, *args)
}
