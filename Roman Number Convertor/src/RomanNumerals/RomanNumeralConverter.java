package RomanNumerals;

import java.util.*;

public class RomanNumeralConverter {
    private static ArrayList<String> romanLetters;
    private static ArrayList<Integer> romanNumbers;

    static {

        romanNumbers = new ArrayList<>();
        romanNumbers.add(1);
        romanNumbers.add(4);
        romanNumbers.add(5);
        romanNumbers.add(9);
        romanNumbers.add(10);
        romanNumbers.add(40);
        romanNumbers.add(90);
        romanNumbers.add(50);
        romanNumbers.add(100);
        romanNumbers.add(400);
        romanNumbers.add(900);
        romanNumbers.add(500);
        romanNumbers.add(1000);

        romanLetters = new ArrayList<>();
        romanLetters.add("I");
        romanLetters.add("IV");
        romanLetters.add("V");
        romanLetters.add("IX");
        romanLetters.add("X");
        romanLetters.add("XL");
        romanLetters.add("XC");
        romanLetters.add("L");
        romanLetters.add("C");
        romanLetters.add("CD");
        romanLetters.add("CM");
        romanLetters.add("D");
        romanLetters.add("M");
    }

    public static int ConvertToNumber(String romanNum) throws RomanError {
        for (int i = 0; i < romanNum.length(); i++) {
            String singleChar = String.valueOf(romanNum.charAt(i));
            if (!romanLetters.contains(singleChar)) {
                throw new RomanError("Character '" + singleChar + "' is not a roman letter!");
            }
        }

        int returnVal = 0;
        for (int i = 0; i < romanNum.length(); i++) {
            String a = String.valueOf(romanNum.charAt(i));
            if (i != romanNum.length()-1 && GetValueNum(a) < GetValueNum(String.valueOf(romanNum.charAt(i+1)))) {
                returnVal += GetValueNum(String.valueOf(romanNum.charAt(i+1))) - GetValueNum(a);
                i++;
            } else {
                returnVal += GetValueNum(a);
            }
        }
        return returnVal;
    }

    public static String ConvertToRomanNumbers(int num) throws RomanError {
        if (num <= 0) throw new RomanError("Number cannot be zero or negative!");
        String returnVal = "";
        int runningVal = num;
        for (int i = romanNumbers.size()-1; i >= 0; i--) {
            int currentNumber = romanNumbers.get(i);

            while (runningVal >= currentNumber) {
                returnVal += GetValue(currentNumber);
                runningVal -= currentNumber;
            }
            if (runningVal == 0) break;
        }
        return returnVal;
    }

    public static int GetValueNum(String number) throws RomanError {
        if (!romanLetters.contains(number)) throw new RomanError("Input '" + number + "' is not valid");
        return romanNumbers.get(romanLetters.indexOf(number));
    }

    public static String GetValue(int value) throws RomanError {
        if (!romanNumbers.contains(value)) throw new RomanError("Value " + value + " is not valid");
        return romanLetters.get(romanNumbers.indexOf(value));
    }
}
