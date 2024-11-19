package edu.bsu.cs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntToRomanNumeralTest {
    IntToRomanNumeral convert = new IntToRomanNumeral();

    @Test
    void testConvert1() {
        assertEquals("I", convert.convertToRomanNumeral(1));
    }

    @Test
    void testConvert5() {
        assertEquals("V", convert.convertToRomanNumeral(5));
    }

    @Test
    void testConvert10() {
        assertEquals("X", convert.convertToRomanNumeral(10));
    }

    @Test
    void testConvert50() {
        assertEquals("L", convert.convertToRomanNumeral(50));
    }

    @Test
    void testConvert100() {
        assertEquals("C", convert.convertToRomanNumeral(100));
    }

    @Test
    void testConvert500() {
        assertEquals("D", convert.convertToRomanNumeral(500));
    }

    @Test
    void testConvert1000() {
        assertEquals("M", convert.convertToRomanNumeral(1000));
    }

    @Test
    void testLowerBound() {
        assertEquals("Not valid input", convert.convertToRomanNumeral(0));
    }

    @Test
    void testUpperBound() {
        assertEquals("Not valid input", convert.convertToRomanNumeral(3001));
    }
}
