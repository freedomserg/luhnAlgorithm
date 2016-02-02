package com.goit.projects.luhnAlgorithm;

public class InappropriateSymbolsInCardNumberException extends RuntimeException {
    public InappropriateSymbolsInCardNumberException(String message) {
        super(message);
    }
}
