package com.xqy.www.mybatis

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.SpringApplication
//
//@SpringBootApplication
@MapperScan("com.xqy.www.mybatis.mapper")
abstract class MybatisApplication
//Wb-a?gyA+0I
fun main(args: Array<String>) {
   SpringApplication.run(MybatisApplication::class.java,*args)
}
//CREATE TABLE `sys`.`t_app_girl` (
//`id` INT NOT NULL,
//`name` VARCHAR(32) NULL,
//PRIMARY KEY (`id`));