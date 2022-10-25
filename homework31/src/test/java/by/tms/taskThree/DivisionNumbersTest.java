package by.tms.taskThree;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisionNumbersTest {

    DivisionNumbers divisionNumbers = new DivisionNumbers();

    @ParameterizedTest
    @CsvSource(value = {
            "70,22,3.1809998",
            "-10,-5,2",
            "-25,7,-3.5709999",
            "32,40,0.8000001",
            "-10,-5,2",
            "5,0,0",
            "0,5,0"
    }, ignoreLeadingAndTrailingWhitespace=true)
    public void testDivision(float dividend, float divisor,float result){

        float actual = DivisionNumbers.division(dividend,divisor);

        assertEquals(result, actual);

    }
}
