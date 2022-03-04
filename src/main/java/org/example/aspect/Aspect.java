package org.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.example.aop.Book;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@org.aspectj.lang.annotation.Aspect
@Order(1)
public class Aspect {



//    @Pointcut("execution(* org.example.aop.Library.get* ())")
//    private void allGetMethodFromLibrary(){
//
//    }
//
//    @Pointcut("execution(* org.example.aop.Library.ret* ())")
//    private void allReturnMethodFromLibrary(){
//    }
//
//    @Pointcut("allGetMethodFromLibrary() || allReturnMethodFromLibrary()")
//    private void allGetAndReturnMethodFromLibrary() {
//
//    }
//
//    @Before("allGetMethodFromLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice : writing Log #1");
//    }
//
//    @Before("allReturnMethodFromLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice : writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodFromLibrary()")
//    public void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("beforeGetAndReturnLoggingAdvice : writing Log #3");
//    }


    @Before("org.example.aspect.MyPointcut.AllAddMethod()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature "+ methodSignature);
        System.out.println("methodSignature.getMethod()  "+ methodSignature.getMethod());
        System.out.println("methodSignature.getName()  "+ methodSignature.getName());
        System.out.println("methodSignature.getReturnType()  "+ methodSignature.getReturnType());

        if (methodSignature.getName().equals("addBook")) {
            Object[] objects = joinPoint.getArgs();
            for (Object res : objects) {
                if (res instanceof Book) {
                    Book myBook = (Book) res;
                    System.out.println("название книги " + myBook.getName()
                    + " автор книги " + myBook.getAuthor() + " год издания " + myBook.getYearOfPublication());
                } else if (res instanceof String){
                    System.out.println("книгу в библиотеку принес " + res);
                }
            }
        }

        System.out.println("beforeAddBookAdvice : логирование попытка получить книгу!");
        System.out.println("--------------------------");
    }

//    @Before("execution(* ret* ())")
//    public void beforeReturnBookAdvice() {
//        System.out.println("beforeReturnBookAdvice : попытка вернуть книгу!");
//    }

}
