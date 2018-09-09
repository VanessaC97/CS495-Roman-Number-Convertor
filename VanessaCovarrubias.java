package RomanNumeralsTest;

import RomanNumerals.RomanError;
import RomanNumerals.RomanNumeralConverter;
import org.junit.jupiter.api.*;

public class VanessaCovarrubias {
    @Test
    public void NegativeRomanNumeralOne_InvalidNumber(){
        Exception output = null;
        try {
            RomanNumeralConverter.ConvertToNumber("-I");
        } catch (RomanError e) {
            output = e;
        }
        Assert.assertNotEquals(null, output);
    }_

    @Test
    public void DecimalNumber_InvalidNumber(){
        Exception output = null;
        try {
            RomanNumeralConverter.ConvertToRomanNumbers(1.1);
        } catch (RomanError e) {
            output = e;
        }
        Assert.assertNotEquals(null, output);
    }

    @Test
    public void ToArabicNumber_Five() {
        String numeral = null;
        try {
            numeral = RomanNumeralConverter.ConvertToRomanNumbers(5);
        } catch (RomanError e) {
            e.printStackTrace();
        }
        Assert.assertEquals("V", numeral);
    }

}
