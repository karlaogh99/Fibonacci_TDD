package Fibonacci;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Fibonacci {
    private ArrayList<Integer> fibonacciArrayL;
    public Fibonacci( ){
        fibonacciArrayL = new ArrayList<>();
        fibonacciArrayL.add(0);
        fibonacciArrayL.add(1);
        fibonacciArrayL.add(1);
        fibonacciArrayL.add(2);
        fibonacciArrayL.add(3);
        fibonacciArrayL.add(5);
        fibonacciArrayL.add(8);
        fibonacciArrayL.add(13);
        fibonacciArrayL.add(21);
        fibonacciArrayL.add(34);
        fibonacciArrayL.add(55);
        fibonacciArrayL.add(89);
        fibonacciArrayL.add(144);
        fibonacciArrayL.add(233);
    }

    public boolean traverseArray(int product){



        return false;
    }
    public int[] productFib(int product) {
        int[] result = new int[3];
        for (int i = 1; i < product; i++) {
            if (isHigh(i, i--, product)) {

            }

        }
        return result;
    }

    public boolean isHigh(int num1, int num2, int product) {
        return false;
    }


    public boolean isFibonacci(int numberToTest){
            if (fibonacciArrayL.contains(numberToTest)){
                return true;
            }
        return false;
    }
}
