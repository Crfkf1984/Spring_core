package org.example;

import org.springframework.stereotype.Component;

//@Component("myCat")
public class Cat implements Pet{
    private String name;
    private String age;
    @Override
    public void say() {
        System.out.println("Meov-meov");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
