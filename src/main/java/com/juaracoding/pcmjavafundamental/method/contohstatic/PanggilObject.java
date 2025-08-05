package com.juaracoding.pcmjavafundamental.method.contohstatic;

public class PanggilObject {

    public static void main(String[] args) {
        VarStatic v1 = new VarStatic();
        v1.getCount();
        System.out.println(v1);
        VarStatic v2 = new VarStatic();
        v2.getCount();
//        System.out.println(VarStatic.intCount);
        System.out.println(v2);
        VarStatic v3 = new VarStatic();
        v3.getCount();
        System.out.println(v3);
    }
}