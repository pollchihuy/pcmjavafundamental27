package com.juaracoding.pcmjavafundamental.excephandling;

public class ThrowsExample {

    public static void main(String[] args) {

        try{
            System.out.println("Hello World 1");
            String strC = printCs();
            System.out.println("Hello World 2");
        }catch(Exception e){
            System.out.println("Error Fungsi Main");
        }
    }

    /** UDF - User Defined Function */
    private static String printCs() throws InterruptedException,Exception {
        Thread.sleep(1000);
        int intX = 1/0;
//        try {
//            Thread.sleep(1000);
//            int intX = 1/0;
//        } catch (Exception e) {
//            System.out.println("Error Fungsi Custom");
//        }

        return  "OK";
    }
}
