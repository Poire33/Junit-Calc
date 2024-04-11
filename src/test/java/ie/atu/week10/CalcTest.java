package ie.atu.week10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {
    Calc newCalc;

    @Test
    void testAdd()
    {
        newCalc = new Calc();
        assertEquals(10, newCalc.add(4, 6));
    }

    @Test
    void testSubtract()
    {
        newCalc = new Calc();
        assertEquals(24, newCalc.subtract(30, 6));
    }
}
