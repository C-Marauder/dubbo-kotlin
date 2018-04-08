package com.xqy.www.api

interface GirlService<out T> {
    fun findGirl():T
}