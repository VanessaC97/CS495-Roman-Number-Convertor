package RomanNumerals;

public class Main {
    public static void main(String[] args) {
        try {
            int value = RomanNumeralConverter.ConvertToNumber("XI");
            System.out.println(value);

            String numerals = RomanNumeralConverter.ConvertToRomanNumbers(65);
            System.out.println(numerals);
        } catch (RomanError e) {
            e.printStackTrace();
        }
    }
}