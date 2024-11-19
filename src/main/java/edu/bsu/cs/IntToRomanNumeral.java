package edu.bsu.cs;

public class IntToRomanNumeral {
    public String convertToRomanNumeral(int givenNumber) {
        if (givenNumber < 1 || givenNumber > 3000) {
            return "Not valid input";
        }
        if (givenNumber == 1) {
            return "I";
        } else if (givenNumber == 5) {
            return "V";
        } else if (givenNumber == 10) {
            return "X";
        } else if (givenNumber == 50) {
            return "L";
        } else if (givenNumber == 100) {
            return "C";
        } else if (givenNumber == 500) {
            return "D";
        } else if (givenNumber == 1000) {
            return "M";
        }
        return null;
    }
}
