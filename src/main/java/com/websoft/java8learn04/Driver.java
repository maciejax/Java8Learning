package com.websoft.java8learn04;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Maciej on 2015-09-25.
 */
public class Driver {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        PredicateDemo predicateDemo = new PredicateDemo();

        System.out.println("All #s" + predicateDemo.testPredicate01(x -> true, list));
        System.out.println("Even #s" + predicateDemo.testPredicate01(x -> (x & 1) == 0, list));
        System.out.println("Odd #s" + predicateDemo.testPredicate01(x -> (x & 1) == 1, list));
    }
}
