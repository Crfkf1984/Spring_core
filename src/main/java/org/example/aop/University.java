package org.example.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class University {
    private List<Student> students;

    public void addStudent() {
        students = new ArrayList<>();
        Student st1 = new Student("Артем Бубнов", 1, 4.5);
        Student st2 = new Student("Артур Батонов", 2, 2.5);
        Student st3 = new Student("Виктор Пикей", 3, 3.5);
        Student st4 = new Student("Петр Булкин", 4, 5.5);

        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
    }

    public List<Student> getStudents() {
        System.out.println("Начало работы метода getStudents");

        System.out.println(students.get(4));

        System.out.println("Список студентов :");
        System.out.println(students);
        return students;
    }
}
