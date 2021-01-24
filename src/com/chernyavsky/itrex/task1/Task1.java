package com.chernyavsky.itrex.task1;

import java.util.StringJoiner;

public class Task1 {

    public static void main(String[] args) {
        String originalStr = "success the thee dcckcaoouoo a ae and coffee";
        String duplicate = "success the thee dcckcaoouoo a ae and coffee";
        duplicate = stringModifier(originalStr, duplicate);
        System.out.println(duplicate);
    }

    public static String stringModifier(String originalStr, String duplicate) {
        duplicate = replaceCharC(duplicate);
        duplicate = removeDoubleChar(duplicate);
        duplicate = removeLastCharE(duplicate);
        duplicate = deleteArticles(originalStr, duplicate);
        return duplicate;
    }

    public static String replaceCharC(String input) {  // SUCCESS   ("ci" -> "si" \ "ce" -> "se" \ "ck" -> "k" \ "c" -> "k" \ strong order left-to-right
        int indexOfC = input.toLowerCase().indexOf("c");
        while (indexOfC != -1) {
            String substringWithC;
            if (indexOfC + 2 < input.length()) {
                substringWithC = input.substring(indexOfC, indexOfC + 2);
            } else {
                substringWithC = input.substring(indexOfC);
            }
            String remainingString = input.substring(0, indexOfC);

            switch (substringWithC) {
                case "ci":
                    input = remainingString + "si" + input.substring(indexOfC + 2);
                    break;
                case "ce":
                    input = remainingString + "se" + input.substring(indexOfC + 2);
                    break;
                case "ck":
                    input = remainingString + "k" + input.substring(indexOfC + 2);
                    break;
                default:
                    input = remainingString + "k" + input.substring(indexOfC + 1);
                    break;
            }
            indexOfC = input.indexOf("c");
        }
        return input;
    }

    public static String removeDoubleChar(String input) {
        input = input.toLowerCase();
        input = input.replaceAll("ee", "i");
        input = input.replaceAll("oo", "u");
        input = input.replaceAll("([a-z])\\1+", "$1");
        return input;
    }

    public static String removeLastCharE(String input) {
        if (input.endsWith("e")) {
            input = input.substring(0, input.length() - 1);
        }
        return input;
    }

    public static String deleteArticles(String origin, String afterDeleteE) {
        String[] arrayOrigin = origin.toLowerCase().split(" ");
        String[] arrayAfterDeleteE = afterDeleteE.toLowerCase().split(" ");

        for (int i = 0; i < arrayOrigin.length; i++) {
            if (arrayOrigin[i].matches("\\b(the|a|an)\\b")) {
                arrayAfterDeleteE[i] = "";
            }
        }
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (String s : arrayAfterDeleteE) {
            if (!s.equals(""))
                stringJoiner.add(s);
        }
        afterDeleteE = stringJoiner.toString();
        return afterDeleteE;
    }
}
