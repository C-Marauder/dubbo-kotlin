package com.xqy.www.client

import com.xqy.www.client.config.ConsumerConfiguration
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.AnnotationConfigApplicationContext

@SpringBootApplication
class ClientApplication
private val logger: Logger by lazy {
    LoggerFactory.getLogger(ConsumerConfiguration::class.java)
}
fun main(args: Array<String>) {
    System.setProperty("java.net.preferIPv4Stack", "true");
    AnnotationConfigApplicationContext().apply {
        register(ConsumerConfiguration::class.java)
        refresh()
    }.start()
    logger.debug("consumer 服务启动 ^_^")
    SpringApplication.run(ClientApplication::class.java,*args)
}
