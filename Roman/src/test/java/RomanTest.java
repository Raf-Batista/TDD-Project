import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanTest {
    @Test
    public void shouldReadI() {
        int expected = 1;
        int actual = Roman.convert("I");

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReadV() {
        int expected = 5;
        int actual = Roman.convert("V");

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReadX() {
        int expected = 10;
        int actual = Roman.convert("X");

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReadL() {
        int expected = 50;
        int actual = Roman.convert("L");

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReadC() {
        int expected = 100;
        int actual = Roman.convert("C");

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReadD() {
        int expected = 500;
        int actual = Roman.convert("D");

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReadM() {
        int expected = 1000;
        int actual = Roman.convert("M");

        assertEquals(expected, actual);
    }

    @Test
    public void shouldAddII() {
        int expected = 2;
        int actual = Roman.convert("II");

        assertEquals(expected, actual);
    }

    @Test
    public void shouldAddXX() {
        int expected = 20;
        int actual = Roman.convert("XX");

        assertEquals(expected, actual);
    }

    @Test
    public void shouldInterpretIV() {
        int expected = 4;
        int actual = Roman.convert("IV");

        assertEquals(expected, actual);
    }

    @Test
    public void shouldInterpretMCM() {
        int expected = 1900;
        int actual = Roman.convert("MCM");

        assertEquals(expected, actual);
    }

    @Test
    public void shouldInterpretMCMXLIV() {
        int expected = 1944;
        int actual = Roman.convert("MCMXLIV");

        assertEquals(expected, actual);
    }
}
