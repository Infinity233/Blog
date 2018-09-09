package com.Infinity;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.Infinity.mapper")
public class BolgApplication {

    public static void main(String[] args) {
        SpringApplication.run(BolgApplication.class, args);
    }
}
