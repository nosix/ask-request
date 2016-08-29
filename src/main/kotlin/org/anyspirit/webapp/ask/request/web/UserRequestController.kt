package org.anyspirit.webapp.ask.request.web

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class UserRequestController {

    @RequestMapping("/user-request-list")
    fun showList(): String = "user-request-list"
}
