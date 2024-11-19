package edu.bsu.cs;

public class IntToRomanNumeral {
    public String convertToRomanNumeral(int givenNumber) {
        if (givenNumber == 1) {
            return "I";
        } else if (givenNumber == 5) {
            return "V";
        }
        return null;
    }
}
