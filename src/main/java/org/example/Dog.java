package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("myDog")
//@Scope(value = "singleton")
public class Dog implements Pet{
    private String name;
    private int age;
    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void say() {
        System.out.println("Baow-waow");
    }
    @PostConstruct
    public void init() {
        System.out.println("Class dog: Init-method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Class dog: Destroy-method");
    }

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

}
