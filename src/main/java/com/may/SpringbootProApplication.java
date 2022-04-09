package com.may;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.may.mapper")
@SpringBootApplication
public class SpringbootProApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootProApplication.class, args);
    }

}
