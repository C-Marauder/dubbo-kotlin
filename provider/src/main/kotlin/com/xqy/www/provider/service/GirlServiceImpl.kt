package com.xqy.www.provider.service

import com.alibaba.dubbo.config.annotation.Service
import com.xqy.www.api.GirlService
import com.xqy.www.domain.Girl
import org.springframework.beans.factory.annotation.Autowired

@Service(interfaceClass = GirlService::class)
class GirlServiceImpl:GirlService<Girl> {


    override fun findGirl(name: String): Girl {
        return Girl()
    }
}