package com.goit.projects.luhnAlgorithm;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        IOUtil.printToConsole(LuhnAlgorithmUtil.isValidCardNumber(IOUtil.inputData()));
    }
}