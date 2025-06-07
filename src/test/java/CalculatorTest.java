import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void testSum(){
        int result = calculator.sum(4,5);
        assertEquals(9, result, "should be equal 9");
    }
    @Test
    void testMinus(){
        int result = calculator.minus(7, 4);
        assertEquals(3, result, "should be equal 3");
    }
    @Test
    void testMultiplication(){
        int result = calculator.multiplication(2, 3);
        assertEquals(6, result, "should be equal 6");

    }
    @Test
    void testDivision(){
        int result = calculator.division(6, 2);
        assertEquals(3, result, "should be equal 3");
    }
}
