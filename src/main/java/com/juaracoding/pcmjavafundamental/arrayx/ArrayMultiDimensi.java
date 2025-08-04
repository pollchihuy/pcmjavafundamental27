package com.juaracoding.pcmjavafundamental.arrayx;

public class ArrayMultiDimensi {

    public static void main(String[] args) {
        int [][] intArrHC = {{1,2},{3,4,5},{10,11,12,13,14}};
        int [][] intArrMulti = new int [2][3];
        intArrMulti[0][0] = 10;
        intArrMulti[0][1] = 11;
        intArrMulti[0][2] = 12;

        intArrMulti[1][0] = 13;
        intArrMulti[1][1] = 14;
        intArrMulti[1][2] = 15;

        for (int i = 0; i < intArrMulti.length; i++) {
            for (int j = 0; j < intArrMulti[i].length; j++) {
                System.out.print(intArrMulti[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("================");
        for (int i = 0; i < intArrHC.length; i++) {
            for (int j = 0; j < intArrHC[i].length; j++) {
                System.out.print(intArrHC[i][j] + " ");
            }
            System.out.println();
        }

    }
}
