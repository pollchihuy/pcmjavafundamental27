package com.juaracoding.pcmjavafundamental.logikapercabangan;

public class IfExample {

    public static void main(String[] args) {
        String username = "paul";
        if(username.equals("paul")){
            System.out.println("Terprint");
        }else{
            System.out.println("Tidak Terprint");
        }
        if(true){
            return;
        }
        for (int i = 0;
             i < 10;
             i++) {
            System.out.println(i);
        }
        if(3>2)
            System.out.println("true");

        String strHuruf = "l";
        switch(strHuruf){
            case "i":
                System.out.println("Huruf I ");break;
            case "j":
                System.out.println("Huruf J");break;
            case "l":
                System.out.println("Huruf L ");break;
            default:
                System.out.println("Bukan Huruf");break;
        }
        if(strHuruf.equals("a") ||
                strHuruf.equals("i") ||
                strHuruf.equals("u") ||
                strHuruf.equals("e") ||
                strHuruf.equals("o")){
            System.out.println("Huruf Vokal");
        }else {
            System.out.println("Huruf Konsonan");
        }

        if(strHuruf.equals("b") ||
                strHuruf.equals("c") ||
                strHuruf.equals("d") ||
                strHuruf.equals("f") ||
                strHuruf.equals("g") ||
                strHuruf.equals("h") ||
                strHuruf.equals("j") ||
                strHuruf.equals("k") ||
                strHuruf.equals("l")){

            System.out.println("Huruf Konsonan");
        }else {
            System.out.println("Huruf Vokal");
        }
    }
}
