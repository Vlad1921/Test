package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void getCm() {
        Float a = new Float("304.8");
        Float b = Main.getCm((float) 10);
        assertEquals(a,b);
    }

    @Test
    public void getFut() {
        Float a = new Float("10");
        Float b = Main.getFut((float) 304.8);
        assertEquals(a,b);
    }
}
