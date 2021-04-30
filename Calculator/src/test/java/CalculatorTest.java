import main.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    @Test
    public void handlesEmptyInput()  {
        int expected = 0;
        int actual = Calculator.add("");

        assertEquals(expected, actual);
    }

    @Test
    public void handlesSingleNumber()  {
        int expected = 1;
        int actual = Calculator.add("1");

        assertEquals(expected, actual);
    }

    @Test
    public void handlesDoubleNumbers()  {
        int expected = 3;
        int actual = Calculator.add("1,2");

        assertEquals(expected, actual);
    }

    @Test
    public void handlesThreeNumbers()  {
        int expected = 5;
        int actual = Calculator.add("1,2,2");

        assertEquals(expected, actual);
    }

    @Test
    public void handlesFourNumbers() {
        int expected = 7;
        int actual = Calculator.add("1,2,2,2");

        assertEquals(expected, actual);
    }

    @Test
    public void handlesNewlineDelimiter() {
        int expected = 7;
        int actual = Calculator.add("1\n2\n2\n2");

        assertEquals(expected, actual);
    }

    @Test
    public void handlesAnyDelimiter()  {
        int expected = 7;
        int actual = Calculator.add("//;\n1;2;2;2");

        assertEquals(expected, actual);
    }

    @Test
    public void handlesSingleNegativeNum() {
        Exception exception = assertThrows(Exception.class, () -> {
            Calculator.add("-1");
        });

        assertEquals("negatives not allowed -1", exception.getMessage());
    }

    @Test
    public void handlesMultipleNegativeNums()  {
        Exception exception = assertThrows(Exception.class, () -> {
            Calculator.add("-1,-2");
        });

        assertEquals("negatives not allowed -1,-2", exception.getMessage());
    }
}
