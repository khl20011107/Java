package org.example.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component("calc")
@Aspect
public class Normal {

    @Pointcut("execution(* org.example.aop.CalcImpl.*(..))")
    public void pointCut(){}

    @Before(value = "pointCut()")
    public void beforeMethod(JoinPoint point) {
//        point.getSignature().get
        System.out.println("执行之前");
    }

    @After(value = "pointCut()")
    public void afterMethod() {
        System.out.println("执行之后");
    }
}
