package com.websoft.java8learn01;

/**
 * Created by bpld096 on 25/09/2015.
 */
@FunctionalInterface
public interface DoSomethingIF2 {

    void doSomething();

    default void doSomeOtherThing(){
        System.out.println("DoSomethingIF2.doSomeOtherThing()");
    }

}
