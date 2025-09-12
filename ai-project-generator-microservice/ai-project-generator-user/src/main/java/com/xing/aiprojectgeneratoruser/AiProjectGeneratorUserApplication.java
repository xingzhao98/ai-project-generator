package com.xing.aiprojectgeneratoruser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.xing.aiprojectgeneratoruser.mapper")
@ComponentScan("com.xing")
public class AiProjectGeneratorUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(AiProjectGeneratorUserApplication.class, args);
    }
}

