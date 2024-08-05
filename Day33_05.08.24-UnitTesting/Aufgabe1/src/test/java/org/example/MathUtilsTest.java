package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MathUtilsTest {
    @Test
    void Max4or5(){
        MathUtils m1 = new MathUtils();
        assertEquals(5,m1.max(4,5));
    }

    @Test
    void Min4or5(){
        MathUtils m1 = new MathUtils();
        assertEquals(4,m1.min(4,5));
    }
}