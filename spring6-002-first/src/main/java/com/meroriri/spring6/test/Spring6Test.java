package com.meroriri.spring6.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring6Test {
    @Test
    public void testFirst(){
        //初始化Spring容器上下文(解析beans.xml文件，創建所有bean對象)
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Object userBean = applicationContext.getBean("userBean");
        System.out.println(userBean);

    }
}
