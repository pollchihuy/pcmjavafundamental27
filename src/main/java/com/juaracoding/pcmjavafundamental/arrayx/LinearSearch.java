package com.juaracoding.pcmjavafundamental.arrayx;

import java.util.Scanner;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 04/08/2025 21:38
@Last Modified 04/08/2025 21:38
Version 1.0
*/
public class LinearSearch {

    public static void main(String[] args) {
        int intArr [] = {12,4,3,2,30,21};

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Bilangan yang ingin dicari : ");
        int intSearch = sc.nextInt();
        boolean isFound = false;
        for(int i=0; i<intArr.length; i++){
            if(intArr[i] == intSearch){
                isFound = true;
                System.out.println("Ditemukan index ke "+i);
                break;
            }
        }
        if(!isFound){
            System.out.println("Data Tidak Ditemukan ");
        }

    }
}
