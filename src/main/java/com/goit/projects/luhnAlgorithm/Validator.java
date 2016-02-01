package com.goit.projects.luhnAlgorithm;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator implements CreditCardValidator {
    @Override
    public void verifyInputNumber(String inputNumber) {
        Pattern pattern = Pattern.compile("^[0-9]+");
        Matcher matcher = pattern.matcher(inputNumber);
        if (!matcher.matches()) {
            throw new InappropriateSymbolsInCardNumberException();
        }
    }
}
