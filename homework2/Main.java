package com.company;

public class Main {

    public static void main(String[] args) {
        String[][] firstArray = {
                {"5", "6", "2", "8"},
                {"3", "6", "1", "4"},
                {"4", "4", "7", "1"},
                {"4", "0", "6", "5"}
        };
        String[][] secondArray = {
                {"5", "7", "6", "3"},
                {"7", "0"},
                {"0", "2", "7", "3"},
                {"0", "3", "0", "9"}
        };
        String[][] thirdArray = {
                {"8", "2", "3", "4"},
                {"6", "45", "", "11"},
                {"0", "2", "7", "65"},
                {"0", "12", "6", "6"}
        };

        try {
            System.out.println(Converter.stringConverter(firstArray));
        } catch (CustomException e) {
            e.getMessage();
        }


        try {
            System.out.println(Converter.stringConverter(secondArray));
        } catch (CustomException e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println(Converter.stringConverter(thirdArray));
        } catch (CustomException e) {
            System.err.println(e.getMessage());
        }
    }
}

