package com.juaracoding.pcmjavafundamental.excephandling;

public class ThrowExample {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("i : "+i);
            if(i==2){
                throw new IllegalArgumentException("Looping Sengaja Dihentikan");
            }
        }
    }
}
