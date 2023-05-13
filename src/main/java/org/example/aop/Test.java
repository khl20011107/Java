package org.example.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Calc calc = ioc.getBean("calc", Calc.class);
        int add = calc.add(1, 2);
    }
}
