package org.example.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExeptionHandlingAspect {
    @Before("org.example.aspect.MyPointcut.AllAddMethod()")
    public void exeptionHandlingAdvice() {
        System.out.println("ловим исключение!!!");
        System.out.println("--------------------------");
    }
}
