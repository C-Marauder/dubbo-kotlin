package com.xqy.www.mybatis.mapper

import com.xqy.www.domain.Girl
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select
import org.apache.ibatis.annotations.SelectProvider

interface GirlServiceMapper {
    fun findGirlByName(name:String):Girl
}