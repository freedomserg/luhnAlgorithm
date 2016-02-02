package com.goit.projects.luhnAlgorithm;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        Validator validator = new Validator();
        IOUtil.printToConsole("Please, enter the number of your credit card: ");
        String input = IOUtil.getInputNumber();
        validator.verifyInputNumber(input);

        boolean isValid = LuhnAlgorithmUtil.isValidCardNumber(input);
        IOUtil.printToConsole("Credit card number <" + input + "> is valid: " + isValid);
    }
}