package com.xing.aiprojectgenerator.ai;



import com.xing.aiprojectgenerator.ai.model.HtmlCodeResult;
import com.xing.aiprojectgenerator.ai.model.MultiFileCodeResult;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AiCodeGeneratorServiceTest {

    @Resource
    private AiCodeGeneratorService aiCodeGeneratorService;

    @Test
    void generatHtmlCode() {
        HtmlCodeResult result = aiCodeGeneratorService.generateHtmlCode("生成一个工作记录小工具，不超过20行");
        Assertions.assertNotNull(result);
    }

    @Test
    void generatMultiFileCode() {
        MultiFileCodeResult multiFileCode = aiCodeGeneratorService.generateMultiFileCode("生成一个博客留言板，不超过20行");
        Assertions.assertNotNull(multiFileCode);
    }

    @Test
    void testChatMemory() {
        HtmlCodeResult result = aiCodeGeneratorService.generateHtmlCode("做个程序员鱼皮的工具网站，总代码量不超过 20 行");
        Assertions.assertNotNull(result);
        result = aiCodeGeneratorService.generateHtmlCode("不要生成网站，告诉我你刚刚做了什么？");
        Assertions.assertNotNull(result);
        result = aiCodeGeneratorService.generateHtmlCode("做个程序员鱼皮的工具网站，总代码量不超过 20 行");
        Assertions.assertNotNull(result);
        result = aiCodeGeneratorService.generateHtmlCode("不要生成网站，告诉我你刚刚做了什么？");
        Assertions.assertNotNull(result);
    }

}