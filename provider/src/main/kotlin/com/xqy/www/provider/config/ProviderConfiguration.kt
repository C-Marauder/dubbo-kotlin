package com.xqy.www.provider.config

import com.alibaba.dubbo.config.ApplicationConfig
import com.alibaba.dubbo.config.ProtocolConfig
import com.alibaba.dubbo.config.RegistryConfig
import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
@DubboComponentScan("com.xqy.www.provider")
class ProviderConfiguration {
    @Bean("dubbo-annotation-provider")
    fun getApplicationConfig():ApplicationConfig = ApplicationConfig().apply {
        name = "dubbo-annotation-provider"
    }

    @Bean("dubbo-register")
    fun getRegisterConfig():RegistryConfig = RegistryConfig().apply {
        address = "N/A"
    }

    @Bean("dubbo")
    fun getProtocolConfig():ProtocolConfig = ProtocolConfig().apply {
        name = "dubbo-protocol"
        port = 8080
    }
}



