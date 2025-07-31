package com.juaracoding.pcmjavafundamental.programmingbasics;

public class ClassContoh {

    public int intX = 10;
    public int intY = 20;

    public ClassContoh getData(ClassContoh c) {
        ClassContoh1 c1 = new ClassContoh1();

        return c1.ambilContoh(c);
    }
}
