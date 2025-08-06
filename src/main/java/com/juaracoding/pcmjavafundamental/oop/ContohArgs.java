package com.juaracoding.pcmjavafundamental.oop;

import com.juaracoding.pcmjavafundamental.method.paket1.ClassPaket1;
import com.juaracoding.pcmjavafundamental.oop.genericz.config.MainConfig;

import java.util.Scanner;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 06/08/2025 19:34
@Last Modified 06/08/2025 19:34
Version 1.0
*/
public class ContohArgs extends ClassPaket1 {

    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2.0);
        System.out.println("AS");
        System.out.println(new Object());
//        MainConfig m = new MainConfig(args[0],args[1],args[2]);
//        Scanner sc = new Scanner(System.in);
//        String s = "1";
//        while(s.equals("1")){
//            System.out.println(m.getUrl());
//            System.out.println(m.getPassword());
//            System.out.println(m.getUsername());
//            System.out.println("Mau Lanjut Ketik 1");
//            s = sc.nextLine();
//        }
    }

    @Override
    public String callMethod2() {
        return super.callMethod2();
    }

    public void methodOne(String str){
        System.out.println("OK");
    }

}
