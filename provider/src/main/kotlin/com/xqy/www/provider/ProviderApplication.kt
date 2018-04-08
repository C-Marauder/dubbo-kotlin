package com.xqy.www.provider

import com.xqy.www.api.GirlService
import com.xqy.www.provider.config.ProviderConfiguration
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(value = ["com.xqy.www"])
class ProviderApplication

fun main(args: Array<String>) {
    val girl = AnnotationConfigApplicationContext().apply {
        register(ProviderConfiguration::class.java)
        refresh()
    }.getBean(GirlService::class.java).findGirl()
    System.out.print(girl.toString())
    SpringApplication.run(ProviderApplication::class.java,*args)
}
