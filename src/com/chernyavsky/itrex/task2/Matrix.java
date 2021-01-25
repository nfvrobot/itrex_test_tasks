package com.chernyavsky.itrex.task2;

import java.util.List;

public class Matrix {
    
    public static String[][][] buildMatrix(String[] array) {
        int h = Integer.parseInt(array[0]);
        int m = Integer.parseInt(array[1]);
        int n = Integer.parseInt(array[2]);
        return new String[h][m][n];
    }

    public static String[][][] initializeMatrix(String[][][] array) {

        return array;
    }

    public static char[] convertListToCharArray(List<String> stringList) {

        return null;
    }

}
