package com.websoft.utils;

import com.websoft.java8learn02.Employee;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by bpld096 on 28/09/2015.
 */
public class DataProvider {

    public static final int DEFAULT_RECORDS_COUNT = 10;


    public static List<Employee> getEmployeeList() {
        return getEmployeeList(DEFAULT_RECORDS_COUNT);
    }

    public static List<Employee> getEmployeeList(int count) {
        List<Employee> output = new ArrayList<>();

        long start = System.currentTimeMillis();

        for (int i = 0; i < count; i++) {
            NamesEnum randomName = NamesEnum.randomName();
            Employee newEmp = new Employee(i + 1,
                    new Random().nextInt(110) + 1,
                    randomName.getGender(),
                    randomName.getDesc(),
                    SurnameEnum.randomSurname().getDesc());
            output.add(newEmp);
        }

        long end = System.currentTimeMillis();
        System.out.println("getEmployeeList() time: " + new SimpleDateFormat("ss:SSS").format(end - start));

        return output;
    }
}
