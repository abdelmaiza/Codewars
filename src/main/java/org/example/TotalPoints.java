package org.example;

import java.util.Arrays;

public class TotalPoints {
    public static int points(String[] games) {
        //implement me
        return  Arrays.stream(games)
                        .map(s -> s.split(":"))
                        .mapToInt(TotalPoints::pointsMatch).sum();
    }

    private static int pointsMatch(String[] score) {
        int point = 0;
        if (Integer.parseInt(score[0]) > Integer.parseInt(score[1])){
            point =  3;
        } else if (Integer.valueOf(score[0]).equals(Integer.valueOf(score[1]))){
            point = 1;
        }
        return point;
    }
}
