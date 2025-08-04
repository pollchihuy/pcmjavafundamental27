package com.juaracoding.pcmjavafundamental.excephandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingExample2 {

    public static void main(String[] args) {

        int intDeclare = 0;
        String strX = "";
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Masukkan Data : ");
//            intDeclare = sc.nextInt();
            strX = sc.next();
//            dividing();
//            System.out.println("OK");
//            int [] arr = {0,1,2};
//            System.out.println(arr[3]);
//            intDeclare = 9;
        }catch (IndexOutOfBoundsException e){
            System.out.println("Error nya : "+e.getMessage()+" , cause : "+e.toString());
        }catch (IllegalArgumentException e){
            System.out.println("Error nya : "+e.getMessage()+" , cause : "+e.toString());
        }catch (InputMismatchException e){
            System.out.println("Error nya : "+e.getMessage()+" , cause : "+e.toString());
        }catch (Exception e){
            System.out.println("Error nya : "+e.getMessage()+" , cause : "+e.toString());
        }finally {
            sc.close();
            System.out.println("Koneksi Tertutup");
        }
    }

    public static void dividing(){
        int intX = 1/0;
    }
}
