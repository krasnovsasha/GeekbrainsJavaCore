package com.company;

public class MyArraySizeException extends CustomException {

    public MyArraySizeException() {
        super("Размер массива не 4x4");
    }
}
