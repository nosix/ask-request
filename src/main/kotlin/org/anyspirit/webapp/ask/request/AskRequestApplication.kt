package org.anyspirit.webapp.ask.request

//import nz.net.ultraq.thymeleaf.LayoutDialect
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
//import org.springframework.context.annotation.Bean
//import org.thymeleaf.spring4.SpringTemplateEngine
//import org.thymeleaf.spring4.templateresolver.SpringResourceTemplateResolver
//import org.thymeleaf.spring4.view.ThymeleafViewResolver

@SpringBootApplication
open class AskRequestApplication {

/*
    @Bean
    open fun viewResolver() = ThymeleafViewResolver().apply {
        templateEngine = templateEngine()
    }

    @Bean
    open fun templateEngine() = SpringTemplateEngine().apply {
        templateResolvers = setOf(templateResolver())
    }

    @Bean
    open fun templateResolver() = SpringResourceTemplateResolver().apply {
        prefix = "classpath:/templates/"
        suffix = ".html"
        templateMode = "LEGACYHTML5"
        isCacheable = false // TODO: make it true before release
    }
*/

}

fun main(args: Array<String>) {
    SpringApplication.run(AskRequestApplication::class.java, *args)

/*
    ctx.beanDefinitionNames.sorted().map {
        println(it)
    }
*/
}
