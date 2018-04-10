package com.xqy.www.provider

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan
import com.xqy.www.mybatis.MybatisApplication
import com.xqy.www.provider.config.ProviderConfiguration
import org.mybatis.spring.annotation.MapperScan
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.AnnotationConfigApplicationContext

@SpringBootApplication
@DubboComponentScan("com.xqy.www.provider")
@MapperScan("com.xqy.www.mybatis.mapper")
class ProviderApplication
private val logger: Logger by lazy {
    LoggerFactory.getLogger(ProviderApplication::class.java)
}
fun main(args: Array<String>) {
    System.setProperty("java.net.preferIPv4Stack", "true");
    AnnotationConfigApplicationContext().apply {
        register(ProviderConfiguration::class.java)
        refresh()
    }.start()
    logger.debug("Provider 服务启动 ^_^")
    try {
        System.`in`.read()
    }catch (e:Exception){
        e.printStackTrace()
    }

}
