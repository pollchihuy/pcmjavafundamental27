package com.juaracoding.pcmjavafundamental.method;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 05/08/2025 19:50
@Last Modified 05/08/2025 19:50
Version 1.0
*/
public class ResponseMessage {

    public  static void saveMessage(){
        System.out.println("Save Success");
    }

    public  static void saveMessage(String flag){
        switch (flag){
            case "en":System.out.println("Save Success");break;
            case "in":System.out.println("Data Berhasil Disimpan");break;
        }
    }
}
