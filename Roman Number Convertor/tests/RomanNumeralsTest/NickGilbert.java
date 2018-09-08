package RomanNumeralsTest;

import RomanNumerals.RomanNumeralConverter;
import RomanNumerals.RomanError;
import org.junit.Test;
import org.junit.jupiter.api.*;
public class NickGilbert {
    @Test
    public void FromLargeNumeralToNumber(){
        int number = 0;
        try {
            number = RomanNumeralConverter.ConvertToNumber("MMXVIII");
        } catch (RomanError e){
            e.printStackTrace();

        }
        Assertions.assertEquals(2018, number);
    }
}
