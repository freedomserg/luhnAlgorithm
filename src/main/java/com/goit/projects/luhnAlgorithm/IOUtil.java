package com.goit.projects.luhnAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOUtil {
    private static Validator validator = new Validator();

    public static String getInputNumber() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please, enter the number of your credit card: ");
        String inputCardNumber = reader.readLine();
        reader.close();
        return inputCardNumber;
    }

    public static void printToConsole(boolean validationResult) {
        if (validationResult) System.out.println("Validation successed!");
        else System.out.println("Validation failed!");
    }
}