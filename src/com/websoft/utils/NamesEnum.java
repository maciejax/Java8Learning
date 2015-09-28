package com.websoft.utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by bpld096 on 28/09/2015.
 */
public enum NamesEnum {
    MACIEJ("Maciej", "M"), MARCIN("Marcin", "M"), MICHAL("Michal", "M"), GRZEGORZ("Grzegorz", "M"),
    PIOTR("Piotr", "M"), TOMASZ("Tomasz", "M"), ROMAN("Roman", "M"), PAWEL("Pawel", "M"),

    MAGDALENA("Magdalena", "F"), ANNA("Anna", "F"), KATARZYNA("Katarzyna", "F"), AGNIESZKA("Agnieszka", "F"),
    JULIA("Julia", "F"), MARCELINA("Marcelina", "F"), MALWINA("Malwina", "F"), MARIA("Maria", "F");


    private final String desc;
    private final String gender;

    public static final List<NamesEnum> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));

    private static int SIZE = VALUES.size();

    public static final Random RANDOM = new Random();

    NamesEnum(String desc, String gender) {
        this.desc = desc;
        this.gender = gender;
    }

    public String getDesc() {
        return desc;
    }

    public String getGender() {
        return gender;
    }

    public static NamesEnum randomName() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
