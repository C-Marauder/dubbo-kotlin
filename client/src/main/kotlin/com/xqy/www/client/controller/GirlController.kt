package com.xqy.www.client.controller

import com.alibaba.dubbo.config.annotation.Reference
import com.xqy.www.api.GirlService
import com.xqy.www.domain.Girl
import com.xqy.www.domain.GirlRequestParam
import com.xqy.www.dubbocore.controller.DubboController
import com.xqy.www.dubbocore.result.JsonResult
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GirlController:DubboController<Girl,GirlRequestParam> {
    @Reference()
    private lateinit var girlService:GirlService<Girl>


    override fun findResult(param: GirlRequestParam): Girl {
        return girlService.findGirl(param.name!!)
    }

    @RequestMapping("/girl")
    override fun findJsonResult(param: GirlRequestParam): JsonResult<Girl> {
        return super.findJsonResult(param)
    }
}