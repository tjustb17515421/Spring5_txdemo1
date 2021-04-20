package com.atguigu.sping5.Test;

import com.atguigu.sping5.Config.TxConfig;
import com.atguigu.sping5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPay {
    @Test
    public void test1()
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService=context.getBean("userService",UserService.class);
        userService.Pay();
    }
    @Test
    public void test2()
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService=context.getBean("userService",UserService.class);
        userService.Pay();
    }
    @Test
    public void test3(){
        ApplicationContext context=  new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService=context.getBean("userService",UserService.class);
        userService.Pay();
    }
}
