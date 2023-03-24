package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("ru.job4j.di");
        context.refresh();
        Store store = context.getBean(Store.class);
        store.add("Petr Arsentev");
        store.add("Ivan ivanov");
        System.out.println("Содержимое первого созданного хранилища:");
        store.getAll().forEach(System.out::println);
        Store another = context.getBean(Store.class);
        System.out.println("Содержимое второго созданного хранилища:");
        another.getAll().forEach(System.out::println);
    }
}