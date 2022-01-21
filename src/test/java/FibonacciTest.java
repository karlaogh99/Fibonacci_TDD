import Fibonacci.Fibonacci;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FibonacciTest {


    @Test
    public void isFibonacci_Test_3(){
        Fibonacci fibonacci = new Fibonacci();
        boolean result= fibonacci.isFibonacci(144);
        assertTrue(result);
    }
}
