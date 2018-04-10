package com.xqy.www.customer.config

import com.alibaba.dubbo.config.ApplicationConfig
import com.alibaba.dubbo.config.RegistryConfig
import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan
import com.xqy.www.customer.service.GirlServiceCustomer
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
        address = "N/A"
        port = 8080
    }
    @Bean
    fun girlServiceCustomer():GirlServiceCustomer{
        return GirlServiceCustomer()
    }
}




