package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleSquareNumbersTest {
    @Test
    public void basicTests(){
        assertEquals(-1,SimpleSquareNumbers.solve(1));
        assertEquals(-1,SimpleSquareNumbers.solve(2));
        assertEquals(1,SimpleSquareNumbers.solve(3));
        assertEquals(-1,SimpleSquareNumbers.solve(4));
        assertEquals(4,SimpleSquareNumbers.solve(5));
        assertEquals(9,SimpleSquareNumbers.solve(7));
        assertEquals(1,SimpleSquareNumbers.solve(8));
        assertEquals(16,SimpleSquareNumbers.solve(9));
        assertEquals(-1,SimpleSquareNumbers.solve(10));
        assertEquals(25,SimpleSquareNumbers.solve(11));
        assertEquals(36,SimpleSquareNumbers.solve(13));
        assertEquals(64,SimpleSquareNumbers.solve(17));
        assertEquals(5428900,SimpleSquareNumbers.solve(88901));
        assertEquals(429235524,SimpleSquareNumbers.solve(290101));
    }
}