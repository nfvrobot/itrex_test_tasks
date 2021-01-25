package com.chernyavsky.itrex.task2;

public class RunFairyTale {

    public static void main(String[] args) {
        String[][][] strings = Matrix.buildMatrix(ParseFile.searchMatrixHMN());
        strings = Matrix.initializeMatrix(strings);
    }
}
