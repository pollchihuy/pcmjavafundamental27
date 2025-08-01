package com.juaracoding.pcmjavafundamental.logikapercabangan;

public class TernaryExample {

    public static void main(String[] args) {
        if(75>3){
            System.out.println("OK");
        }else{
            System.out.println("NOT OK");
        }

        Object obj = 4;
        String isOk = obj==null ? "" : obj.toString();
//        String isOk = obj.toString();
        System.out.println("Nilai isOK : "+isOk);

        Integer isInt = (obj==null) ? 0 : 1;
        System.out.printf("Value isInt "+isInt);
    }
}
