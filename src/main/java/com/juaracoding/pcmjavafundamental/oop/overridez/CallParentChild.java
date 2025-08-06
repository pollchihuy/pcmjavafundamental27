package com.juaracoding.pcmjavafundamental.oop.overridez;

import com.juaracoding.pcmjavafundamental.oop.abst.AbstractExample;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 06/08/2025 20:25
@Last Modified 06/08/2025 20:25
Version 1.0
*/
public class CallParentChild {

    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        Parent p1 = new Child();
        Child2 child2 = new Child2();
        AbstractExample abstractExample = new AbstractExample() {
            @Override
            public void run() {
                System.out.println("UDEH RUN !!");
            }
        };
        abstractExample.executeRun();
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {

                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("New Thread : "+Thread.currentThread().getName()+ " STOP !!");
            }
        });
        t.start();
        System.out.println("Main Thread : "+Thread.currentThread().getName()+ " STOP !!");
    }
}
