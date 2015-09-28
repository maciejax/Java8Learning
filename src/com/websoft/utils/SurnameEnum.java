package com.websoft.utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by bpld096 on 28/09/2015.
 */
public enum SurnameEnum {
    DABROWSKI("Dabrowski"), KOWALSKI("Kowalski"), NOWAK ("Nowak"), DUDA("Duda"), SMOLEN("Smolen"),
    PAWLICKI("Pawlicki"), DOBRUCKI("Dobrucki"), BALINSKI("Balinski"), KUBERA("Kubera"), ZENGOTA("Zengota"),
    LEWANDOWSKI("Lewandowski"), ZIELINSKI("Zielinski"), JANKOWSKI("Jankowski"), KWIATKOWSKI("Kwiatkowski"),
    MAZUR("Mazur"), KRAWCZYK("Krawczyk"), GRABOWSKI("Grabowski"), NOWICKI("Nowicki"), ADAMCZYK("Adamczyk"),
    DUDEK("Dudek"), MAJEWSKI("Majewski"), JAWORSKI("Jaworski");

    private final String desc;

    public static final List<SurnameEnum> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));

    private static int SIZE = VALUES.size();

    public static final Random RANDOM = new Random();

    SurnameEnum(String desc){
        this.desc = desc;
    }

    public String getDesc(){
        return desc;
    }

    public static SurnameEnum randomSurname(){
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
