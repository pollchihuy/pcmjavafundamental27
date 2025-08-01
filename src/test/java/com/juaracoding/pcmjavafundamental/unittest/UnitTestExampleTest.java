package com.juaracoding.pcmjavafundamental.unittest;

import com.juaracoding.pcmjavafundamental.unitest.UnitTestExample;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UnitTestExampleTest {

    UnitTestExample unitTestExample ;

    @BeforeEach
    public void init(){
        unitTestExample = new UnitTestExample();
    }

    @Test
    public void cobaTestExample(){
        Integer intLength = unitTestExample.hitungPanjangCharacter("Paul");
        Assertions.assertEquals(3, intLength);
    }
}
