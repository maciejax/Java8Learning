package com.websoft.java8learn04;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by Maciej on 2015-09-25.
 */
public class PredicateDemo {
    public List<Integer> testPredicate01(Predicate<Integer> p, List<Integer> list){
        List<Integer> output = new ArrayList<>();

        for (Integer l : list)
            if (p.test(l)) output.add(l);

        //List<Integer> output = list.stream().filter(l -> p.test(l)).collect(Collectors.toList());
    return output;
    }
}
