package com.goit.projects.luhnAlgorithm;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        Validator validator = new Validator();
        String input = null;
        try {
            input = IOUtil.getInputNumber();
            validator.verifyInputNumber(input);
        } catch (InappropriateSymbolsInCardNumberException ex) {
            System.out.println("[ERROR]: card number contains only digits [0-9]!");
        }
        IOUtil.printToConsole(LuhnAlgorithmUtil.isValidCardNumber(input));
    }
}