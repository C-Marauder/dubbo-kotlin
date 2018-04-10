package com.xqy.www.dubbocore.controller

import com.xqy.www.dubbocore.constant.FAIL_MESSAGE
import com.xqy.www.dubbocore.constant.FAIL_STATUS
import com.xqy.www.dubbocore.constant.SUCCESS_MESSAGE
import com.xqy.www.dubbocore.constant.SUCCESS_STATUS
import com.xqy.www.dubbocore.result.JsonResult

interface DubboController<T, in P> {

    fun findResult(param: P):T
    fun findJsonResult(param: P): JsonResult<T> = with(param) {
        val result = JsonResult<T>()
        try {
            val obj = findResult(param)
            result.apply {
                data = obj
                message = SUCCESS_MESSAGE
                status = SUCCESS_STATUS
            }

        } catch (e: Exception) {
            result.apply {
                message = FAIL_MESSAGE
                status = FAIL_STATUS
            }
        }
        return result
    }
}