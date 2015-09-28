package com.websoft.java8learn01;

/**
 * Created by bpld096 on 25/09/2015.
 */
@FunctionalInterface
public interface DoSomethingIF {

    void doSomething();

    default void doSomeOtherThing(){
        System.out.println("DoSomethingIF.doSomeOtherThing()");
    }

    //functional interface can have methods from java Object
    int hashCode();

    boolean equals(Object obj);
}
