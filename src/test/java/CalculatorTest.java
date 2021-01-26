import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();


    @Test
    public void canAdd(){
        assertEquals(12, calculator.add(5, 7));
    }

    @Test
    public void canSubtract(){
        assertEquals(2, calculator.subtract(7, 5));
    }

    @Test
    public void canMultiply(){
        assertEquals(35, calculator.multiply(7, 5));
    }

    @Test
    public void canDivide(){
        assertEquals(3, calculator.divide(15.0, 5.0), 0.0);
    }

}
