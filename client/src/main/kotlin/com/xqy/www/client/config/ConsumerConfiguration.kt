package com.xqy.www.client.config

import com.alibaba.dubbo.config.ApplicationConfig
import com.alibaba.dubbo.config.RegistryConfig
import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan
import com.xqy.www.dubbocore.config.LOCALHOST
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
@DubboComponentScan()
class ConsumerConfiguration {

    @Bean("dubbo-annotation-consumer")
    fun getApplicationConfig(): ApplicationConfig = ApplicationConfig().apply {
        name = "dubbo-annotation-consumer"
    }
    @Bean("dubbo-register")
    fun getRegisterConfig(): RegistryConfig = RegistryConfig().apply {
        protocol = "zookeeper"
        address = LOCALHOST

    }

}




