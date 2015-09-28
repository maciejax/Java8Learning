package com.websoft.java8learn02;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.List;
import java.util.Properties;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by bpld096 on 28/09/2015.
 */
public class EmployeePredicates {

    public static Predicate<Employee> isAdultMale(){
        return employee -> employee.getAge() > 21 && employee.getGender().equalsIgnoreCase("M");
    }

    public static Predicate<Employee> isAdultFemale(){
        return employee ->  employee.getAge() > 18 && employee.getGender().equalsIgnoreCase("F");
    }

    public static Predicate<Employee> isAgeMoreThan(Integer age){
        return employee -> employee.getAge() > age;
    }

    public static List<Employee> filterEmployees(List<Employee> list, Predicate<Employee> predicate){
        long start = System.currentTimeMillis();
        List<Employee> result = list.stream().filter(predicate).collect(Collectors.<Employee>toList());
        long end = System.currentTimeMillis();
        System.out.println("\nfilterEmployees() time: " + new SimpleDateFormat("ss:SSS").format(end - start));

        return result;
    }

    public static List<Employee> filterAndSortEmployees(List<Employee> list, Predicate<Employee> predicate, String sortBy){
        return list.stream()
                    .filter(predicate)
                    .sorted(Comparator.comparing(employee -> employee.getFirstName()))
                    .collect(Collectors.<Employee>toList());
    }

    public static List<Employee> filterEmployeesDistinct(List<Employee> list, Predicate<Employee> predicate){
        return list.stream().filter(predicate).collect(Collectors.<Employee>toList());
    }
}
