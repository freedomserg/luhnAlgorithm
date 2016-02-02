package com.goit.projects.luhnAlgorithm;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator implements CreditCardValidator {
    public static final Pattern ONLY_DIGITS_PATTERN = Pattern.compile("^[0-9]+");

    @Override
    public void verifyInputNumber(String inputNumber) {
        Matcher matcher = ONLY_DIGITS_PATTERN.matcher(inputNumber);
        if (!matcher.matches()) {
            throw new InappropriateSymbolsInCardNumberException("[ERROR]: card number contains only digits [0-9]!");
        }
    }
}
