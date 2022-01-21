package Fibonacci;

import java.util.ArrayList;

public class Fibonacci {


    private static ArrayList<Integer> fibonacciArrayL;
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

    public static int[] productFib(int product) {
        int[] result = new int[3];
        int lastFib = 0;
        int newFib = 0;
        for (int i = 1; i < product; i++) {

            if (isHigh(lastFib, newFib, product)) {
                if (isFibonacci(i)){
                    lastFib = newFib;
                    newFib = i;
                }
                if (isMultiplies(lastFib, newFib, product)){
                    result[0] = lastFib;
                    result[1] = newFib;
                    result[2] = 1;
                    return result;
                }
            }else{
                for (int j = newFib;j<0; j++){
                    if (isFibonacci(j)){
                        result[0] = newFib;
                        result[1] = j;
                        result[2] = 0;
                        return result;
                    }
                }
            }
        }
        return result;
    }

    public static boolean isHigh(int num1, int num2, int product) {
        if ((num1 * num2)>product){
            return false;
        }
        return true;
    }


    public static boolean isFibonacci(int numberToTest){
            if (fibonacciArrayL.contains(numberToTest)){
                return true;
            }
        return false;
    }
    public static boolean isMultiplies(int num1, int num2, int product){
        if (num1 * num2 == product){
            return true;
        }else{
            return false;
        }
    }

}
