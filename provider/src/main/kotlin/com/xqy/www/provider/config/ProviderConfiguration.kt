package com.xqy.www.provider.config

import com.alibaba.dubbo.config.ApplicationConfig
import com.alibaba.dubbo.config.ProtocolConfig
import com.alibaba.dubbo.config.RegistryConfig
import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan
import com.xqy.www.dubbocore.config.LOCALHOST
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
        protocol = "zookeeper"
        address = LOCALHOST
        timeout = 10000

    }

    @Bean("dubbo")
    fun getProtocolConfig():ProtocolConfig = ProtocolConfig().apply {
        name = "dubbo"
        port = 20881

    }


}



