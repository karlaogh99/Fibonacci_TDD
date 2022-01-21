import Fibonacci.Fibonacci;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FibonacciTest {
    private Fibonacci fibonacci;
    private int[] resultCorrect;

    @Before
    public void setUp(){
        fibonacci = new Fibonacci();
        resultCorrect = new int[3];
    }
    @Test
    public void isFibonacci_Test_3(){
        boolean result= fibonacci.isFibonacci(144);
        assertTrue(result);
    }
    @Test
    public void isHigh_Test_(){
        boolean result= fibonacci.isMinor(3,4,20);
        assertTrue(result);
    }
    @Test
    public void productFibTest(){
        resultCorrect[0]=21;
        resultCorrect[1]=34;
        resultCorrect[2]=1;
        int[] result = fibonacci.productFib(714);
        assertTrue(result[0] == resultCorrect[0] );
        assertTrue(result[1] == resultCorrect[1] );
        assertTrue(result[2] == resultCorrect[2] );
    }
    @Test
    public void productFibTest_2(){
        resultCorrect[0]=34;
        resultCorrect[1]=55;
        resultCorrect[2]=0;
        int[] result = fibonacci.productFib(800);
        assertTrue(result[0] == resultCorrect[0] );
        assertTrue(result[1] == resultCorrect[1] );
        assertTrue(result[2] == resultCorrect[2] );
    }

}
