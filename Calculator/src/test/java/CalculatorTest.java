import main.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    @Test
    public void handlesEmptyInput() throws Exception {
        int expected = 0;
        int actual = Calculator.add("");

        assertEquals(expected, actual);
    }

    @Test
    public void handlesSingleNumber() throws Exception {
        int expected = 1;
        int actual = Calculator.add("1");

        assertEquals(expected, actual);
    }

    @Test
    public void handlesDoubleNumbers() throws Exception {
        int expected = 3;
        int actual = Calculator.add("1,2");

        assertEquals(expected, actual);
    }

    @Test
    public void handlesThreeNumbers() throws Exception {
        int expected = 5;
        int actual = Calculator.add("1,2,2");

        assertEquals(expected, actual);
    }

    @Test
    public void handlesFourNumbers() throws Exception {
        int expected = 7;
        int actual = Calculator.add("1,2,2,2");

        assertEquals(expected, actual);
    }

    @Test
    public void handlesNewlineDelimiter() throws Exception {
        int expected = 7;
        int actual = Calculator.add("1\n2\n2\n2");

        assertEquals(expected, actual);
    }

    @Test
    public void handlesAnyDelimiter() throws Exception {
        int expected = 7;
        int actual = Calculator.add("//;\n1;2;2;2");

        assertEquals(expected, actual);
    }

    @Test
    public void handlesSingleNegativeNum() throws Exception {
        Exception exception = assertThrows(Exception.class, () -> {
            Calculator.add("-1");
        });

        assertEquals("negatives not allowed -1", exception.getMessage());
    }

    @Test
    public void handlesMultipleNegativeNums() throws Exception  {
        Exception exception = assertThrows(Exception.class, () -> {
            Calculator.add("-1,-2");
        });

        assertEquals("negatives not allowed -1,-2", exception.getMessage());
    }
}
