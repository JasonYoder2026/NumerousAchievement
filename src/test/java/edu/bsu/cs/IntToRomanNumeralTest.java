package edu.bsu.cs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntToRomanNumeralTest {
    IntToRomanNumeral convert = new IntToRomanNumeral();

    @Test
    void testConvert1() {
        assertEquals("I", convert.convertToRomanNumeral(1));
    }
}
