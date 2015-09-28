package com.websoft.java8learn01;

/**
 * Created by bpld096 on 25/09/2015.
 */
public class DoSomething implements DoSomethingIF, DoSomethingIF2 {


    @Override
    public void doSomething() {
        System.out.println("DoSomething...");
    }

    @Override
    public void doSomeOtherThing(){
        System.out.println("DoSomething.doSomeOtherThing()");
    }

    public static void main(String[] args) {
        DoSomethingIF doSomething = new DoSomething();

        doSomething.doSomething();
        doSomething.doSomeOtherThing();
    }
}
