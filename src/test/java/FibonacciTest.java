import Fibonacci.Fibonacci;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FibonacciTest {
    private Fibonacci fibonacci;
    @Before
    public void setUp(){
        fibonacci = new Fibonacci();

    }
    @Test
    public void isFibonacci_Test_3(){
        boolean result= fibonacci.isFibonacci(144);
        assertTrue(result);
    }
    @Test
    public void isHigh_Test_(){
        boolean result= fibonacci.isHigh(3,4,20);
        assertTrue(result);
    }
}
