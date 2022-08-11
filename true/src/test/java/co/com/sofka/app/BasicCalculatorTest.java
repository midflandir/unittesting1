package co.com.sofka.app;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class BasicCalculatorTest{

    BasicCalculator calculator = new BasicCalculator();



    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals((first + " + " + second + " should equal " + expectedResult),
                expectedResult, calculator.sum(first, second));
    }


    @Test
    public void basicCalculatorSumTest(){
        // Arrange
        Long number1 = 1l;
        Long number2 = 3l;
        Long expectedresult = 4l;
        // Act
        Long result = calculator.sum(number1, number2);

        // Assert
        assertEquals(expectedresult, result);

    }

    @Test
    public void basicCalculatorSubtractTest(){
        Long number1 = 5l;
        long number2 = 2l;
        Long expectedresult = 3l;

        Long result = calculator.sub(number1, number2);

        assertEquals(expectedresult, result);

    }



}
