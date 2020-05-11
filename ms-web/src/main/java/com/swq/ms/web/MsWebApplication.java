package com.swq.ms.web;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;




@MapperScan("com.swq.ms.dao")
@SpringBootApplication
@ComponentScan({"com.swq.ms.service.*","com.swq.ms.web.controller"})
public class MsWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsWebApplication.class, args);
    }

}
