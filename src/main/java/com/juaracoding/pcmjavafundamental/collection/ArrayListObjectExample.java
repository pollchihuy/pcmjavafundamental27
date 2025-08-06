package com.juaracoding.pcmjavafundamental.collection;

import com.juaracoding.pcmjavafundamental.oop.overridez.Child2;

import java.util.ArrayList;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 06/08/2025 21:15
@Last Modified 06/08/2025 21:15
Version 1.0
*/
public class ArrayListObjectExample {
    public static void main(String[] args) {
        System.out.println("ArrayListObjectExample");
        ArrayList<Child2> list = new ArrayList();
        list.add(new Child2(1,2));//0
        list.add(new Child2(3,4));//1
        list.add(new Child2(5,6));//2
        System.out.println(list);
        for (Child2 child : list) {
            System.out.println("Reference " +child);
            System.out.println("Age :"+ child.getAge());
            System.out.println("Height :"+child.getHeight());
            System.out.println("==================");
        }
        System.out.println("contoh ==================================");
        list.remove(2);
//        list.get(1).setAge(6);
//        list.get(1).setHeight(7);
        list.set(1, new Child2(6,7));
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Reference " +list.get(i));
            System.out.println("Age :"+ list.get(i).getAge());
            System.out.println("Height :"+list.get(i).getHeight());
            System.out.println("==================");

        }
        list.clear();
        System.out.println("Isi List : "+list);
//        list.get(1).setAge(6);
//        list.get(1).setHeight(7);
        list.isEmpty();
    }
}
