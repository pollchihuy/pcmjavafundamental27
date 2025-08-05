package com.juaracoding.pcmjavafundamental.method.paket2;

import com.juaracoding.pcmjavafundamental.method.paket1.ClassPaket1;
import com.juaracoding.pcmjavafundamental.method.paket1.ClassPaketHemat;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 05/08/2025 20:02
@Last Modified 05/08/2025 20:02
Version 1.0
*/
class MethodImpl extends ClassPaket1 {

    public static void main(String[] args) {

        ClassPaketHemat classPaketHemat = new ClassPaketHemat(2L,"Paul");
        ClassPaketHemat classPaketHemat2 = new ClassPaketHemat();
//        "".toLowerCase();
//        classPaketHemat.setId(2L);
//        classPaketHemat.setName("Nama");
        System.out.println(classPaketHemat.getId());
        System.out.println(classPaketHemat.getName());
//        2L - 2
//                N'ini text'
//        callMethod3(6);
//        callMethod3("A");
//        callMethod3(2.0);
//        MethodImpl m = new MethodImpl();
//        m.impl();
//        impl();
    }
//    public static void impl(){
//        String s = callMethod2()+" OK ";
//        System.out.println(s);
//        callMethod1();
//    }

    @Deprecated
    public String callMethod2() {

        //message
        //timestamp
        //status
        //data
        //error_code
        return "CUMI";
    }
}
