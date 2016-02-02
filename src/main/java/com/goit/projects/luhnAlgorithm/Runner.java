package com.goit.projects.luhnAlgorithm;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        Validator validator = new Validator();
        String input = IOUtil.getInputNumber();
        validator.verifyInputNumber(input);
        IOUtil.printToConsole(LuhnAlgorithmUtil.isValidCardNumber(input));
    }
}