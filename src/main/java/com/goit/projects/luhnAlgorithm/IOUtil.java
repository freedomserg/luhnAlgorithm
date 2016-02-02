package com.goit.projects.luhnAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOUtil {
    public static String getInputNumber() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputCardNumber = reader.readLine();
        reader.close();
        return inputCardNumber;
    }

    public static void printToConsole(String message) {
        System.out.print(message);
    }
}