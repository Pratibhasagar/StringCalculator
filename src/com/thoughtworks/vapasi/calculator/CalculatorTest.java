package com.thoughtworks.vapasi.calculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test(expected = ArithmeticException.class)
    public void testJUnitVer () {
        float result = (1/0);
    }

    @Test
    public void testDivide6By3() {
        assertEquals(2.0, calculator.divide(6L, 3L),0.0);
    }

    @Test
    public void testDivideSomeLongNumbers(){
        //12222000000 / 122
        assertEquals(1000.0, calculator.divide(122000L, 122L),0.0);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
            calculator.divide(122000L, 0L);
    }

    @Test()
    public void testDivideByZeroWithDifferentValuesShouldBeSame(){
        assertEquals(calculator.divide(122000L, 0L), calculator.divide(122L, 0L), 0.0);
    }

}
