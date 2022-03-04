package org.example.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.example.aop.Library;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingaspect {
    @Around("execution(String returnBook())")
    public Object aroundreturnBookAdvice(ProceedingJoinPoint point) throws Throwable {
        System.out.println("В библиотеку пытаются вернуть книгу!");
        Object obj = null;
        try {
             obj = point.proceed();
        } catch (Exception e) {
            System.out.println("Было поймано исключение!!! " + e);
            throw e;
        }
        System.out.println("В библиотеку успешно вернули книгу!");
        return obj;
    }
}
