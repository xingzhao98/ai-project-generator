package com.xing.aiprojectgenerator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.xing.aiprojectgenerator.mapper")
public class AiProjectGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(AiProjectGeneratorApplication.class, args);
    }

}
