package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("myPerson")
public class Person{

    //@Value(value = "${person.name}")
    private String name;
    //@Value(value = "${person.age}")
    private int age;
//     @Autowired
   //@Qualifier(value = "myCat")
    private Pet pet;

//    @Autowired
    public Person(Pet pet) {
        this.pet = pet;
        this.name = name;
        this.age = age;
    }

    public void callYuorPet() {
        System.out.println("my pet voice!!!" );
       pet.say();
    }


//    @Autowired
//    @Qualifier(value = "myCat")
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Value(value = "${person.name}")
    public void setName(String name) {
        this.name = name;
    }

    @Value(value = "${person.age}")
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
