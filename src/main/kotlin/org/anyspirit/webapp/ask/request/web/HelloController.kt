package org.anyspirit.webapp.ask.request.web

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @RequestMapping("/")
    fun index(): String = "Hello Beautiful World!!!"
}
