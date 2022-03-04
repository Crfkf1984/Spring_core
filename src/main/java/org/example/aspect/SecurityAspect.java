package org.example.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {
    @Before("org.example.aspect.MyPointcut.AllAddMethod()")
    public void beforeAddSecurityAdvice() {
        System.out.println("beforeAddSecurityAdvice : проверка прав на получение книги или журнала!");
        System.out.println("--------------------------");
    }
}
