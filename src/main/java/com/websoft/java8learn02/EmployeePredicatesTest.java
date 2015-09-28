package com.websoft.java8learn02;

import java.util.Arrays;
import java.util.List;

import static com.websoft.java8learn02.EmployeePredicates.*;
import static com.websoft.utils.DataProvider.getEmployeeList;

/**
 * Created by bpld096 on 28/09/2015.
 */
public class EmployeePredicatesTest {

    public static void main(String[] args) {

        List<Employee> list = getEmployeeList(100000);

        list.stream().forEach(employee -> System.out.print(employee));

        System.out.println(filterAndSortEmployees(list, isAdultFemale(), "FIRSTNAME"));
//        System.out.println(filterEmployees(list,isAdultFemale()));
//        System.out.println(filterEmployees(list,isAdultMale()));
//        System.out.println(filterEmployees(list,isAgeMoreThan(99)));

    }
}
