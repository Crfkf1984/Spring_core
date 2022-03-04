package org.example;

import org.example.aop.Book;
import org.example.aop.Library;
import org.example.aop.Student;
import org.example.aop.University;
import org.example.config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Method main starts");

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

       Library library = context.getBean("libraryBean", Library.class);
           String nameBook =  library.returnBook();
           System.out.println("В библиотеку вернули книгу " + nameBook);


        context.close();

        System.out.println("Method main ends");
    }
}
