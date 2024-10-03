import org.example.StringCalculator;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StringCalculatorTest {

    private final StringCalculator calculator = new StringCalculator();

    @Test
    public void testEmptyString() {
        assertEquals(0, calculator.Add(""));
    }

    @Test
    public void testSingleNumber() {
        assertEquals(1, calculator.Add("1"));
    }

    @Test
    public void testTwoNumbers() {
        assertEquals(3, calculator.Add("1,2"));
    }
}

