package com.websoft.java8learn02;

import java.util.List;

import static com.websoft.utils.DataProvider.getEmployeeList;

/**
 * Created by bpld096 on 28/09/2015.
 */
public class EmployeeEnumTest {

    public static void main(String[] args) {
        List<Employee> list = getEmployeeList(20);
//        list.forEach(e -> System.out.println(e.toString()));
    }
}
