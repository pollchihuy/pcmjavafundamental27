package com.juaracoding.pcmjavafundamental.method.contohstatic;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 05/08/2025 20:49
@Last Modified 05/08/2025 20:49
Version 1.0
*/
public class VarStatic {

    public int intCount=0;

    public VarStatic() {
        intCount++;
    }

    public void getCount(){
        System.out.println("Nilai Count :"+intCount);
    }
}
