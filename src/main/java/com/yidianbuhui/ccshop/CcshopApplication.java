package com.yidianbuhui.ccshop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yidianbuhui.ccshop.dao")
public class CcshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(CcshopApplication.class, args);
    }

}
