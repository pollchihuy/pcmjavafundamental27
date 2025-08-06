package com.juaracoding.pcmjavafundamental.method.paket1;

import com.juaracoding.pcmjavafundamental.oop.IParent;
import com.juaracoding.pcmjavafundamental.oop.Parent;

import java.util.ArrayList;
import java.util.List;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 05/08/2025 20:01
@Last Modified 05/08/2025 20:01
Version 1.0
*/
public class ClassPaket1 {

    protected static void callMethod1(){
        System.out.println("callMethod1");
        List l = new ArrayList();
        ArrayList la = new ArrayList();

        Parent p = new Parent();
        IParent ip = new Parent();
    }

    protected String callMethod2(){
        System.out.println("callMethod1");
        System.out.println("callMethod1");
        System.out.println("callMethod1");
        return "Terpanggil";
    }

    public static String callMethod2(String str){//x1
        System.out.println("Ini yang di passing "+str);
        return "Terpanggil";
    }
    public static void callMethod3(String str, String str1){//x2
        System.out.println("Ini yang di passing str "+str);
        System.out.println("Ini yang di passing str1 "+str1);
    }
    public static void callMethod3(int intX, String str1){//x2
    }

    public static void callMethod3(Object obj){//x2
    }

    public static void callMethod3(Integer obj){//x2
    }
}
