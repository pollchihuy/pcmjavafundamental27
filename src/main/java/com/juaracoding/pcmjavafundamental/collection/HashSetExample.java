package com.juaracoding.pcmjavafundamental.collection;

import com.juaracoding.pcmjavafundamental.method.paket1.ClassPaket1;

import java.util.*;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 06/08/2025 21:37
@Last Modified 06/08/2025 21:37
Version 1.0
*/
public class HashSetExample {

    public static void main(String[] args) {
        //1 variable object id nama deskripsi
//        nama deskipsi id
        Set set = new HashSet();
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(2);
        set.add(4);
        System.out.println(set);

        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        System.out.println(list);

        Set s = new HashSet();
        ClassPaket1 c1 = new ClassPaket1();
        s.add(c1);
        s.add(c1);
        s.add( new ClassPaket1());
        System.out.println("Value s : "+s);
        Iterator it = s.iterator();
        int intLoop = 1;
        while (it.hasNext()) {
            System.out.println("Set "+intLoop+" -- "+ it.next());
            intLoop++;
        }
    }
}
