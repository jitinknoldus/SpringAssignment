package com.knoldus;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        MessagePrinter messagePrinter =(MessagePrinter) applicationContext.getBean("MessagePrinter");
        messagePrinter.printMessage();
    }
}
