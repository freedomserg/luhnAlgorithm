package com.goit.projects.luhnAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOUtil {
    private static Validator validator = new Validator();

    public static String inputData() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputCardNumber = null;
        System.out.print("Please, enter the number of your credit card: ");
        while(true) {
            inputCardNumber = reader.readLine();
            try {
                validator.verifyInputNumber(inputCardNumber);
                break;
            }catch (InappropriateSymbolsInCardNumberException ex) {
                System.out.println("[ERROR]: card number contains only digits [0-9]. Try again!");
            }
        }
        reader.close();
        return inputCardNumber;
    }

    public static void printToConsole(boolean validationResult) {
        if (validationResult) System.out.println("Validation successed!");
        else System.out.println("Validation failed!");
    }
}
