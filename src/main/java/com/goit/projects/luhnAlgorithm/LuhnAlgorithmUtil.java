package com.goit.projects.luhnAlgorithm;

public class LuhnAlgorithmUtil {
    public static final int LUHN_LIMIT = 9;

    public static boolean isValidCardNumber(String inputCardNumber) {
        int[] cardNumberForValidation = convertStringToArrayOfDigits(inputCardNumber);

        for (int i = cardNumberForValidation.length - 1; i >= 0; i--) {
            if (cardNumberForValidation.length % 2 == 0) {
                if (i % 2 != 0) continue;
                cardNumberForValidation[i] = modifyData(cardNumberForValidation[i]);
            } else {
                if (i % 2 == 0) continue;
                cardNumberForValidation[i] = modifyData(cardNumberForValidation[i]);
            }
        }
        int sumOfDigits = 0;
        for (int digit : cardNumberForValidation) {
            sumOfDigits += digit;
        }
        return sumOfDigits%10 == 0;
    }

    private static int[] convertStringToArrayOfDigits(String inputCardNumber) {
        String[] tempStringArray = inputCardNumber.split("");
        int[] cardNumberBuffer = new int[tempStringArray.length];
        int i = 0;
        for (String str : tempStringArray) {
            cardNumberBuffer[i] = Integer.parseInt(str);
            i++;
        }
        return cardNumberBuffer;
    }

    private static int modifyData(int digit) {
        digit *= 2;
        if (digit > LUHN_LIMIT) {
            digit = digit%10 + digit/10;
        }
        return digit;
    }
}
