package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class StackTrance {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("text.txt");
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
    }
}
