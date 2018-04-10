package com.xqy.www.dubbocore.result

data class JsonResult<T>(var status:String?=null,var message:String?=null,var data:T?=null)