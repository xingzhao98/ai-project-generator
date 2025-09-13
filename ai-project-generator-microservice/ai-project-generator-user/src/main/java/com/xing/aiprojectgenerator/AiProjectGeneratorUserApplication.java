package com.xing.aiprojectgenerator;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.xing.aiprojectgenerator.mapper")
@EnableDubbo
public class AiProjectGeneratorUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(AiProjectGeneratorUserApplication.class, args);
    }
}

