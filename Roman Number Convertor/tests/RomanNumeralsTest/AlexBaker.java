package RomanNumeralsTest;

import RomanNumerals.RomanNumeralConverter;
import RomanNumerals.RomanError;
import org.junit.jupiter.api.*;

public class AlexBaker {
    @Test
    public void ToNumerals_LargeNumber() {
        String numerals = null;
        try {
            numerals = RomanNumeralConverter.ConvertToRomanNumbers(47);
        } catch (RomanError e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("XLVII", numerals);
    }
    @Test
    public void ToNumber_InvalidNumber() {
        Exception output = null;
        try {
            RomanNumeralConverter.ConvertToRomanNumbers(0);
        } catch (RomanError e) {
            output = e;
        }
        Assert.assertNotEquals(null, output);
    }

    @Test
    public void ToNumber_One() {
        String numerals = null;
        try {
            numerals = RomanNumeralConverter.ConvertToRomanNumbers(1);
        } catch (RomanError e) {
            e.printStackTrace();
        }
        Assert.assertEquals("I", numerals);
    }

}
