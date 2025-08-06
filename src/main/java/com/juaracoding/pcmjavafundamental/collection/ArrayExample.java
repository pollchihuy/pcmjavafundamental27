package com.juaracoding.pcmjavafundamental.collection;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 06/08/2025 21:10
@Last Modified 06/08/2025 21:10
Version 1.0
*/
public class ArrayExample {


    public static void main(String[] args) {
        Integer [] intArr = new Integer[2];
        intArr[0] = 1;
        intArr[1] = 2;
        System.out.println(intArr);
        for (Integer i : intArr) {
            System.out.println(i);
        }
        intArr = new Integer[3];

    }
}
