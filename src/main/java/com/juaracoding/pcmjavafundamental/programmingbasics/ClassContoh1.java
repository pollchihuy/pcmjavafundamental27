package com.juaracoding.pcmjavafundamental.programmingbasics;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 31/07/2025 20:04
@Last Modified 31/07/2025 20:04
Version 1.0
*/
public class ClassContoh1 {

    public String s = "m";
    public ClassContoh ambilContoh(ClassContoh contoh){
        contoh.intX=12;
        contoh.intY=12;

        return contoh;
    }

    public String getString(){
        return "b";
    }

    public int passByValue(int x){
        x = 13;
        return x;
    }

    public void passByReference(ObjectExample x){
        x.intX=14;
    }
}
