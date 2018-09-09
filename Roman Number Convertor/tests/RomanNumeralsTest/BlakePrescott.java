package RomanNumeralsTest;

import RomanNumerals.RomanError;
import RomanNumerals.RomanNumeralConverter;
import org.junit.jupiter.api.*;

public class BlakePrescott {
	@Test
	 public void ToNumerals_NegativeNumeral() {
        Exception output = null;
        try {
            RomanNumeralConverter.ConvertToRomanNumbers(-1);
        } catch (RomanError e) {
            output = e;
        }
        Assert.assertNotEquals(null, output);
    }
	
	@Test
    public void ToRomanNumber_One() {
       int number = 0;
        try {
            number = RomanNumeralConverter.ConvertToNumber("I");
        } catch (RomanError e){
            e.printStackTrace();

        }
        Assertions.assertEquals(1, number);
    }

}
