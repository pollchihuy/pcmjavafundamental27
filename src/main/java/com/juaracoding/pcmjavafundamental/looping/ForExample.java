package com.juaracoding.pcmjavafundamental.looping;

import java.util.Scanner;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 05/08/2025 19:04
@Last Modified 05/08/2025 19:04
Version 1.0
*/
public class ForExample {

    public static void main(String[] args) {
//        for (int x = 0; x < 10; x++) {
//            for (int y = 0; y < 10; y++) {
//                if(y==2){
//                    break;
//                }
//                for (int z = 0; z < 10; z++) {
//                    for (int w = 0; w < 10; w++) {
//                        System.out.print(x + ", " + y + ", " + z + ", " + w + "\n");
//                    }
//                }
//            }
//        }
//        for (int x = 0; x < 10; x++) {
//
//            if(x % 2 == 0){
//                continue;
//            }
//            System.out.println("x: " + x);
//
//        }
//        int [] intArray = new int [10];
//        for (int x = 0; x < intArray.length; x++) {
//            System.out.println(intArray[x]);
//        }
//        int intLoop = 0;
//        for (int x :intArray) {
//            System.out.println(x);
//            intLoop++;
//        }

        int intData [] = {39,20,15,44,21,7};
        Scanner sc = new Scanner(System.in);
        int intSearch = sc.nextInt();
        int intLoop = 0;
        int intCompare = intData[intLoop];
        boolean isFound = false;
        while(!isFound){
            if(intSearch == intData[intLoop] && intLoop == (intData.length - 1)){
                isFound = true;
            }
            intLoop++;
        }
//        for (int x = 0;
//             x < 3;
//             x++) {
//            System.out.println("X = "+x);
//        }
    }
}
