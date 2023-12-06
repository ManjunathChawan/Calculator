//Calculatortest.java
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Test;


public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(12, calculator.add(5, 7));
    }

    @Test
    public void testSubtraction() {
        assertEquals(3, calculator.subtract(5, 2));
    }

    @Test
    public void testMultiplication() {
        assertEquals(45, calculator.multiply(5, 9));
    }

    @Test
    public void testDivision() {
        assertEquals(9, calculator.divide(45, 5));
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(45, 0));
    }

    @Test
    public void testSquareRoot() {
        assertEquals(2.0, calculator.squareRoot(4.0), 0.001);
        assertThrows(IllegalArgumentException.class, () -> calculator.squareRoot(-1.0));
    }

    @Test
    public void testPower() {
        assertEquals(8.0, calculator.power(2.0, 3.0), 0.001);
    }

    @Test
    public void testAbsoluteValue() {
        assertEquals(5, calculator.absoluteValue(-5));
    }

    @Test
    public void testFactorial() {
        assertEquals(120, calculator.factorial(5));
        assertEquals(1, calculator.factorial(0));
        assertThrows(IllegalArgumentException.class, () -> calculator.factorial(-1));
    }
}