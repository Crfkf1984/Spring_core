package org.example.aop;

import org.springframework.stereotype.Component;

public class Library {
    public void getBook() {
        System.out.println("Мы берем книгу! ");
        System.out.println("--------------------------");
    }

    public String returnBook() {
        int a = 10 / 0;
        System.out.println("Возвращаем книгу!!! ");
       return "Война и мир!";
    }

    public void getMagazine() {
        System.out.println("Мы берем журнал! ");
        System.out.println("--------------------------");
    }

    public void returnMagazine() {
        System.out.println("Возвращаем журнал! ");
        System.out.println("--------------------------");
    }


    public void addBook(String personName, Book book) {
        System.out.println("Мы добавляем книгу в библиотеку! ");
        System.out.println("--------------------------");
    }

    public void addMagazine() {
        System.out.println("Мы добавляем журнал в библиотеку! ");
        System.out.println("--------------------------");
    }
}
