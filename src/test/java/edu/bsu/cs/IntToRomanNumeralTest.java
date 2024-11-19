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
    void testConvert4() {
        assertEquals("IV", convert.convertToRomanNumeral(4));
    }

    @Test
    void testConvert5() {
        assertEquals("V", convert.convertToRomanNumeral(5));
    }

    @Test
    void testConvert9() {
        assertEquals("IX", convert.convertToRomanNumeral(9));
    }

    @Test
    void testConvert10() {
        assertEquals("X", convert.convertToRomanNumeral(10));
    }

    @Test
    void testConvert40() {
        assertEquals("XL", convert.convertToRomanNumeral(40));
    }

    @Test
    void testConvert50() {
        assertEquals("L", convert.convertToRomanNumeral(50));
    }

    @Test
    void testConvert90() {
        assertEquals("XC", convert.convertToRomanNumeral(90));
    }

    @Test
    void testConvert100() {
        assertEquals("C", convert.convertToRomanNumeral(100));
    }

    @Test
    void testConvert400() {
        assertEquals("CD", convert.convertToRomanNumeral(400));
    }

    @Test
    void testConvert500() {
        assertEquals("D", convert.convertToRomanNumeral(500));
    }

    @Test
    void testConvert900() {
        assertEquals("CM", convert.convertToRomanNumeral(900));
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
