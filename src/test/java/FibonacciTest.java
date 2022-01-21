import Fibonacci.Fibonacci;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FibonacciTest {


    @Test
    public void isFibonacci_Test_3(){
        Fibonacci fibonacci = new Fibonacci(10);
        boolean result= fibonacci.isFibonacci(2);
        assertTrue(result);
    }
}
