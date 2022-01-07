package com.lening;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.lening.mapper"})
public class TestLnZhangheApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestLnZhangheApplication.class, args);
    }

}
