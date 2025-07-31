package com.juaracoding.pcmjavafundamental.programmingbasics;

public class Passing {

    public static void main(String[] args) {
//        int intX = 10;
//        int intY = intX;
//        intX = 11;
//        System.out.println("Value intX : "+intX);
//        System.out.println("Value intY : "+intY);
//
//        ClassContoh classContoh1 = new ClassContoh();
//        classContoh1.intX=12;
//        classContoh1.intY=13;
//        ClassContoh classContoh2 = classContoh1;
//        System.out.println("Value classContoh1 : "+classContoh1);
//        System.out.println("Value classContoh2 : "+classContoh2);
//        classContoh2.intX=15;
//        classContoh1.intX=15;
//        classContoh2.intY=16;
//        System.out.println("value contoh1 : "+classContoh1.intX);
//        System.out.println("value contoh1 : "+classContoh1.intY);

//        int passing = 12;
//        ClassContoh1 c1 = new ClassContoh1();
//        c1.passByValue(passing);
//        System.out.println("Nilai Passing : "+passing);

        ObjectExample obj = new ObjectExample();
        obj.intX=12;

        ClassContoh1 classContoh1 = new ClassContoh1();
        classContoh1.passByReference(obj);
        System.out.println("Nilai obj : "+obj.intX);

        int tipe = 0;
        String str = "2";
        System.out.println(Integer.toBinaryString(12));
        if(str instanceof String){
            System.out.println("INI STRING");
        }
    }
}
