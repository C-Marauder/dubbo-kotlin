package com.xqy.www.provider.service

import com.alibaba.dubbo.config.annotation.Service
import com.xqy.www.api.GirlService
import com.xqy.www.domain.Girl
import com.xqy.www.mybatis.mapper.GirlServiceMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.boot.autoconfigure.EnableAutoConfiguration

@Service(interfaceClass = GirlService::class)
class GirlServiceImpl:GirlService<Girl> {

    @Autowired
    private lateinit var girlServiceMapper:GirlServiceMapper

    override fun findGirl(name: String): Girl {
        return girlServiceMapper.findGirlByName(name)
    }
}