package com.juaracoding.pcmjavafundamental.excephandling;

import com.juaracoding.pcmjavafundamental.programmingbasics.ClassContoh;

import java.util.ArrayList;
import java.util.List;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 01/08/2025 21:04
@Last Modified 01/08/2025 21:04
Version 1.0
*/
public class ExHandlingExample {

    public static void main(String[] args) {
//        format username : huruf kecil + spasi  AVCakjshd123@

        Thread t  = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Thread " + i);
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    //langsung kirim smtp
                    System.out.println(e.getMessage());
                }
            }
        });
        t.start();
        System.out.println("OK");
        List<ClassContoh> l = new ArrayList<>();
        l.add(new ClassContoh());
        l.add(new ClassContoh());
        l.add(new ClassContoh());
        System.out.println(l);
        System.out.println("L ke 0 "+l.get(0));
        System.out.println("L ke 1 "+l.get(1));
        System.out.println("L ke 2 "+l.get(2));
        l.clear();
        System.out.println(l);
    }
}