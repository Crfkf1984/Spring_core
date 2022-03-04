package org.example.aspect;

import org.aspectj.lang.annotation.*;
import org.aspectj.lang.annotation.Aspect;
import org.example.aop.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
    @Before("execution(* getStudents())")
    public void getAllStudents() {
        System.out.println("getAllStudents : Логируем Получение списка студентов!!!");
    }

    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void returnAllStudents(List<Student> students) {
        Student firstStudent = students.get(0);
        String namesurname = "Mr. " + firstStudent.getNameSurname();
        firstStudent.setNameSurname(namesurname);

        double avgGrade = firstStudent.getAvgGade();
        avgGrade = avgGrade + 1;
        firstStudent.setAvgGade(avgGrade);

        System.out.println("returnAllStudents : Логируем возвращение списка студентов!!!");
    }

    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exeption")
    public void returnThrowsStudents(Throwable exeption) {
        System.out.println("returnThrowsStudents : Логируем выброс исключения " + exeption);
    }

    @After("execution(* getStudents())")
    public void afterGetStudentLoggingAdvice() {
        System.out.println("Логируем нормальную работу метода или выброс исключения!!!");
    }
}
