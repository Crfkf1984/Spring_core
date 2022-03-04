package org.example.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyPointcut {
    @Pointcut("execution(* abc* (..))")
    public void AllAddMethod(){}
}
