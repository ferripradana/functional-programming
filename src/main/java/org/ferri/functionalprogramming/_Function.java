package org.ferri.functionalprogramming;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        System.out.println("Hello world");

        int incr = incrementByOne(1);
        System.out.println(incr);

        int incr2 = incrementByOneFunction.apply(2);
        System.out.println(incr2);

        int multy = multiplyBy10Function.apply(2);
        System.out.println(multy);

        int combination = incrementByOneFunction.andThen(multiplyBy10Function).apply(2);
        System.out.println(combination);

        System.out.println(incrementByOneAndMultiply(3,3));
        System.out.println(incrementByOneAndMultiplyFunction.apply(3,3));

    }

    static Function<Integer, Integer> incrementByOneFunction = integer -> integer + 1;

    static  Function<Integer,Integer> multiplyBy10Function = number -> number * 10;

    static int incrementByOne(int number) {
        return number + 1;
    }

    static BiFunction<Integer,Integer,Integer> incrementByOneAndMultiplyFunction =
            (numberToIncrementBy1,numToMultiply) -> (numberToIncrementBy1+1) * numToMultiply;

    static int incrementByOneAndMultiply(int number, int numToMultiply){
        return (number+1)*numToMultiply;
    }

}
