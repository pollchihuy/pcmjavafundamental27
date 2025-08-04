package com.juaracoding.pcmjavafundamental.arrayx;

import com.juaracoding.pcmjavafundamental.programmingbasics.ClassContoh;

public class ArrayExample {
    public static void main(String[] args) {
        int intX = 2;
        int [] intArr = new int [intX];
        intArr[0] = 0;
        intArr[1] = 1;
        System.out.println("Reference intArr : "+intArr);
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
//        Integer [] intArr2 = new Integer[7];
        ClassContoh [] classContoh = new ClassContoh [intX];
        classContoh[0] = new ClassContoh();
        classContoh[1] = new ClassContoh();
        System.out.println(classContoh);
        for (int i = 0; i < classContoh.length; i++) {
            System.out.println(classContoh[i].intX);
        }
        classContoh = null;
//        String [] strArr = new String[100];
//        int [][] intArrHC = {{1,2},{3,4,5}};
//        int [][] intArrMulti = new int[2][3];
        /**
         int [] intArrHC = new int[2];
         intArrHC[0]=1;
         intArrHC[1]=2;
         */

    }
}
