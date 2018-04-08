package com.xqy.www.provider.service

import com.alibaba.dubbo.config.annotation.Service
import com.xqy.www.api.GirlService
import com.xqy.www.domain.Girl

@Service()
class GirlServiceImpl:GirlService<Girl> {
    override fun findGirl(): Girl {
        return Girl("范晓")
    }
}