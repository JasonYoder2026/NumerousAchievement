package edu.bsu.cs;

public class IntToRomanNumeral {
    public String convertToRomanNumeral(int givenNumber) {
        int[] integers = {1, 5, 10, 50, 100, 500, 1000};
        String[] romanNumerals = {"I", "V", "X", "L", "C", "D", "M"};

        if (givenNumber < 1 || givenNumber > 3000) {
            return "Not valid input";
        }
        for (int i = 0; i < integers.length; i++) {
            if(givenNumber == integers[i]) {
                return romanNumerals[i];
            }
        }
        return null;
    }
}
