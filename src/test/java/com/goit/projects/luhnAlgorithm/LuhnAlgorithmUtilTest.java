package com.goit.projects.luhnAlgorithm;

import org.junit.Assert;
import org.junit.Test;

public class LuhnAlgorithmUtilTest {

    @Test
    public void testForValidMasterCardNumber_16digits() throws Exception {
        int[] validMasterCardNumber = {5,1,0,5,1,0,5,1,0,5,1,0,5,1,0,0};
        Assert.assertEquals(true, LuhnAlgorithmUtil.isValidCardNumber(validMasterCardNumber));
    }

    @Test
    public void testForInvalidMasterCardNumber_16digits() throws Exception {
        int[] invalidMasterCardNumber = {5,0,1,6,1,0,5,1,0,5,1,0,5,1,0,0};
        Assert.assertEquals(false, LuhnAlgorithmUtil.isValidCardNumber(invalidMasterCardNumber));
    }

    @Test
    public void testForValidVisaCardNumber_16digits() throws Exception {
        int[] validVisaCardNumber = {4,0,1,2,8,8,8,8,8,8,8,8,1,8,8,1};
        Assert.assertEquals(true, LuhnAlgorithmUtil.isValidCardNumber(validVisaCardNumber));
    }

    @Test
    public void testForInvalidVisaCardNumber_16digits() throws Exception {
        int[] invalidVisaCardNumber = {4,0,1,2,8,8,8,8,8,7,7,7,1,8,8,1};
        Assert.assertEquals(false, LuhnAlgorithmUtil.isValidCardNumber(invalidVisaCardNumber));
    }

    @Test
    public void testForValidVisaCardNumber_13digits() throws Exception {
        int[] validVisaCardNumber = {4,2,2,2,2,2,2,2,2,2,2,2,2};
        Assert.assertEquals(true, LuhnAlgorithmUtil.isValidCardNumber(validVisaCardNumber));
    }

    @Test
    public void testForInvalidVisaCardNumber_13digits() throws Exception {
        int[] invalidVisaCardNumber = {4,2,2,2,2,2,2,2,2,2,2,2,1};
        Assert.assertEquals(false, LuhnAlgorithmUtil.isValidCardNumber(invalidVisaCardNumber));
    }

    @Test
    public void testForValidAmericanExpressCardNumber_15digits() throws Exception {
        int[] validAmericanExpressCardNumber = {3,7,8,2,8,2,2,4,6,3,1,0,0,0,5};
        Assert.assertEquals(true, LuhnAlgorithmUtil.isValidCardNumber(validAmericanExpressCardNumber));
    }

    @Test
    public void testForInvalidAmericanExpressCardNumber_15digits() throws Exception {
        int[] invalidAmericanExpressCardNumber = {3,7,8,2,8,2,2,4,6,3,1,0,0,0,4};
        Assert.assertEquals(false, LuhnAlgorithmUtil.isValidCardNumber(invalidAmericanExpressCardNumber));
    }

    @Test
    public void testForValidAmericanExpressCorporateCardNumber_15digits() throws Exception {
        int[] validAmericanExpressCorporateCardNumber = {3,7,8,7,3,4,4,9,3,6,7,1,0,0,0};
        Assert.assertEquals(true, LuhnAlgorithmUtil.isValidCardNumber(validAmericanExpressCorporateCardNumber));
    }

    @Test
    public void testForInvalidAmericanExpressCorporateCardNumber_15digits() throws Exception {
        int[] invalidAmericanExpressCorporateCardNumber = {2,7,8,7,3,4,4,9,3,6,7,1,0,0,0};
        Assert.assertEquals(false, LuhnAlgorithmUtil.isValidCardNumber(invalidAmericanExpressCorporateCardNumber));
    }

    @Test
    public void testForValidAustralianBankCardNumber_16digits() throws Exception {
        int[] validAustralianBankCardNumber = {3,7,8,7,3,4,4,9,3,6,7,1,0,0,0};
        Assert.assertEquals(true, LuhnAlgorithmUtil.isValidCardNumber(validAustralianBankCardNumber));
    }

    @Test
    public void testForInvalidAustralianBankCardNumber_16digits() throws Exception {
        int[] invalidAustralianBankCardNumber = {3,7,8,7,3,4,4,8,3,6,7,1,0,0,0};
        Assert.assertEquals(false, LuhnAlgorithmUtil.isValidCardNumber(invalidAustralianBankCardNumber));
    }

    @Test
    public void testForValidDinersClubCardNumber_14digits() throws Exception {
        int[] validDinersClubCardNumber = {3,8,5,2,0,0,0,0,0,2,3,2,3,7};
        Assert.assertEquals(true, LuhnAlgorithmUtil.isValidCardNumber(validDinersClubCardNumber));
    }

    @Test
    public void testForInvalidDinersClubCardNumber_14digits() throws Exception {
        int[] invalidDinersClubCardNumber = {3,8,5,2,0,0,1,0,0,2,3,2,3,7};
        Assert.assertEquals(false, LuhnAlgorithmUtil.isValidCardNumber(invalidDinersClubCardNumber));
    }

    @Test
    public void testForValidDiscoverCardNumber_16digits() throws Exception {
        int[] validDiscoverCardNumber = {6,0,1,1,0,0,0,9,9,0,1,3,9,4,2,4};
        Assert.assertEquals(true, LuhnAlgorithmUtil.isValidCardNumber(validDiscoverCardNumber));
    }

    @Test
    public void testForInvalidDiscoverCardNumber_16digits() throws Exception {
        int[] invalidDiscoverCardNumber = {5,0,1,1,0,0,0,9,9,0,1,3,9,4,2,5};
        Assert.assertEquals(false, LuhnAlgorithmUtil.isValidCardNumber(invalidDiscoverCardNumber));
    }

    @Test
    public void testForValidJCBCardNumber_16digits() throws Exception {
        int[] validJCBCardNumber = {3,5,6,6,0,0,2,0,2,0,3,6,0,5,0,5};
        Assert.assertEquals(true, LuhnAlgorithmUtil.isValidCardNumber(validJCBCardNumber));
    }

    @Test
    public void testForInvalidJCBCardNumber_16digits() throws Exception {
        int[] invalidJCBCardNumber = {3,4,6,6,0,0,2,0,2,0,3,6,0,4,0,5};
        Assert.assertEquals(false, LuhnAlgorithmUtil.isValidCardNumber(invalidJCBCardNumber));
    }
}