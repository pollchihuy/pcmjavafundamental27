package com.juaracoding.pcmjavafundamental.strobject;


import com.juaracoding.pcmjavafundamental.programmingbasics.ClassContoh1;

import java.util.Scanner;

public class StringExample {

    public static void main(String[] args) {
        String strInt = "2";
        String strX = new String("2");//1MB
        System.out.println(strInt==strX);
        System.out.println(strInt.equals(strX));


        System.out.println(System.identityHashCode(strInt));
        System.out.println(System.identityHashCode(strX));
        StringBuilder sBuild = new StringBuilder();
        String str = sBuild.append("a").append(3).append(8.0).append("contoh").append(3).append(8.0).append("contoh").append(3).append(8.0).append("contoh").append(3).append(8.0).append("contoh").append(3).append(8.0).append("contoh").append(3).append(8.0).append("contoh").append(3).append(8.0).append("contoh").append(3).append(8.0).append("contoh").append(3).append(8.0).append("contoh").append(3).append(8.0).append("contoh").append(3).append(8.0).append("contoh").append(3).append(8.0).append("contoh").append(3).append(8.0).append("contoh").toString();
        System.out.println("isi sBuild : "+sBuild.toString());
        System.out.println("isi str : "+str);
        System.out.println(sBuild);
        sBuild.setLength(0);
        System.out.println("isi sBuild 2 : "+sBuild.toString());
        String strAppend = sBuild.append("k").append(4).append("9").append(9.0).toString();
//        ClassContoh1 c = new ClassContoh1();
//        ClassContoh1 d = new ClassContoh1();
//        System.out.println(c);
//        System.out.println(d);
        //built in function
        int intX = 0;
        //wraper class
        Integer intY;

        String strHeloo = "Hello World Boy";
        String strHelooW = "Hello World";
        String strHeloLow = "hello world";
        System.out.println("strHeloo Length : "+strHeloo.length());
        System.out.println("strHeloo charAt(6) : "+strHeloo.charAt(6));
        System.out.println("strHeloo equals : "+strHeloo.equals(strHelooW));//==
        System.out.println("strHeloo equalsIgnoreCase : "+strHeloo.equalsIgnoreCase(strHeloLow));
        System.out.println("strHeloo subString 1 param : "+strHeloo.substring(3));
        System.out.println("strHeloo subString 2 param : "+strHeloo.substring(3,8));
        System.out.println("strHeloo LowerCase : "+strHeloo.toLowerCase());
        System.out.println("strHeloo UpperCase : "+strHeloo.toUpperCase());
        String [] strArr = strHeloo.split(" ");
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }

        System.out.println("StartWith "+strHeloo.startsWith("He"));
        System.out.println("EndWith "+strHeloo.toLowerCase().endsWith("boy"));
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Masukkan Nilai Integer : ");
//        int intInput = scanner.nextInt();
//        System.out.print("Masukkan Nilai Double : ");
//        double doubleInput = scanner.nextDouble();
//        System.out.print("Masukkan Nilai Float : ");
//        float floatInput = scanner.nextFloat();
//        System.out.print("Masukkan Nilai String next : ");
//        String strNext = scanner.next();
//        System.out.print("Masukkan Nilai String next : ");
//        String nextLine = scanner.nextLine();
//        System.out.println(intInput);
//        System.out.println(doubleInput);
//        System.out.println(floatInput);
//        "KodeApaGitu"#"paul@gmail.com"#10298190894891;
//        char [] chArr = strHeloo.toCharArray();
//        int intLengthHello = strHeloo.length();
//        /** Contoh 1 */
//        for (int i = 0; i < intLengthHello; i++) {
//            System.out.println(chArr[i]);
//        }
//        System.out.println("==========================");
//        /** Contoh 2 */
//        for (int i = 0; i < intLengthHello; i++) {
//            System.out.println(strHeloo.charAt(i));
//        }
//
//        String data = "Bearer aoskdfpaojt0q897908127-981-3890";// -> data.subString(7)

    }
}
