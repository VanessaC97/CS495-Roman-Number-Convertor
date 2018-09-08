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


}
