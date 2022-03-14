package com.example.kehse;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.kehse.mapper")
public class KehseApplication {

    public static void main(String[] args) {
        SpringApplication.run(KehseApplication.class, args);
    }

}
