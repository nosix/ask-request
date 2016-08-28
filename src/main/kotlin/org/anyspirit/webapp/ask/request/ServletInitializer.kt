package org.anyspirit.webapp.ask.request

import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.web.support.SpringBootServletInitializer

class ServletInitializer : SpringBootServletInitializer() {

	override fun configure(application: SpringApplicationBuilder) : SpringApplicationBuilder {
		return application.sources(AskRequestApplication::class.java)
	}

}
