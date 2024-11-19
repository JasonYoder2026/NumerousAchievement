package edu.bsu.cs;

public class IntToRomanNumeral {
    public String convertToRomanNumeral(int givenNumber) {
        int[] integers = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] romanNumerals = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

        if (givenNumber < 1 || givenNumber > 3000) {
            return "Not valid input";
        }
        for (int i = integers.length-1; i >= 0; i--) {
            if(givenNumber == integers[i]) {
                return romanNumerals[i];
            }
        }
        return null;
    }
}
