package pl.dolega.calculatorweb;


import org.junit.Test;
import pl.dolega.calculatorweb.service.CalculatorService;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTests {

    CalculatorService calculatorService = new CalculatorService();
    BigInteger a = BigInteger.valueOf(3);
    BigInteger b = BigInteger.valueOf(2);

    @Test
    public void testAddition() {
        BigInteger result = calculatorService.addition(a, b);
        assertEquals(BigInteger.valueOf(5), result);
    }

    @Test
    public void testSubtraction() {
        BigInteger result = calculatorService.subtraction(a, b);
        assertEquals(BigInteger.valueOf(1), result);
    }

    @Test
    public void testMultiplication() {
        BigInteger result = calculatorService.multiplication(a, b);
        assertEquals(BigInteger.valueOf(6), result);
    }

    @Test
    public void testDivision() {
        BigDecimal result = calculatorService.division(a, b);
        assertEquals(BigDecimal.valueOf(1.5), result);
    }

}
