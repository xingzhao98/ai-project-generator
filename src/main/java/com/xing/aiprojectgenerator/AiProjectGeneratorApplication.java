package com.xing.aiprojectgenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true)
public class AiProjectGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(AiProjectGeneratorApplication.class, args);
    }

}
