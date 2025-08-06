package com.juaracoding.pcmjavafundamental.collection;

import java.util.*;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 06/08/2025 21:52
@Last Modified 06/08/2025 21:52
Version 1.0
*/
public class HashMapExample {
    public static void main(String[] args) {
        List<Supplier> lS = new ArrayList<>();
        Supplier s = new Supplier();
        s.setName("GARUDA GROUP");
        s.setId(1L);
        s.setAddress("Jln Kebon Pare");
        lS.add(s);

        s.getName();
        s.getId();
        s.getAddress();

        List<Map<String,Object>> l = new ArrayList<>();
        Map<String,Object> h = new LinkedHashMap<>();
        HashMap hx = new HashMap();
//        Map<Integer,Integer> x = new HashMap();
        h.put("name", "GARUDA GROUP");
        h.put("id", 1L);
        h.put("address", "Jln Kebon Pare");
        h.put("phone", "08081212");
        l.add(h);

        h = new HashMap();
        h.put("name", "ELANG GROUP");
        h.put("id", 2L);
        h.put("address", "Jln Kebon Kacang");
        h.put("phone", "081112121");
        l.add(h);


        System.out.println(h);

        l.get(1).put("address","kebon jeruk");
        for (Map<String,Object> m : l) {
//            for (Map.Entry<String,Object> entry : m.entrySet()) {
//                System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
//            }

            System.out.println("id "+m.get("id"));
            System.out.println("address "+m.get("address"));
            System.out.println("phone "+m.get("phone"));
            System.out.println("name "+m.get("name"));
            System.out.println("============");
        }

        System.out.println("============");
        System.out.println("============");
        for (int i = 0; i < l.size() ; i++) {
            if(i==1){
                l.get(i).put("address","kebon jeruk");
            }
            System.out.println("id "+l.get(i).get("id"));
            System.out.println("address "+l.get(i).get("address"));
            System.out.println("phone "+l.get(i).get("phone"));
            System.out.println("name "+l.get(i).get("name"));
            System.out.println("============");
        }
    }
}