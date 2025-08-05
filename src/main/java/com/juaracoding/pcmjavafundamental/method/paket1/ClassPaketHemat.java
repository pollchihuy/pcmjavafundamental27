package com.juaracoding.pcmjavafundamental.method.paket1;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 05/08/2025 21:28
@Last Modified 05/08/2025 21:28
Version 1.0
*/
public class ClassPaketHemat {

    private Long id;
    private String name;

    public ClassPaketHemat(Long id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("2 PARAMETER");
    }
    public ClassPaketHemat(Long id, String name,String cumi) {
        this.id = id;
        this.name = name;
        System.out.println("2 PARAMETER");
    }
    public ClassPaketHemat(Long id, String name,String cumi, Integer k) {
        this.id = id;
        this.name = name;
        System.out.println("2 PARAMETER");
    }

    public ClassPaketHemat() {
        System.out.println("NO PARAMETER BOS");
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}