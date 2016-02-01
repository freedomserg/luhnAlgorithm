package com.goit.projects.luhnAlgorithm;

import org.junit.Assert;
import org.junit.Test;

public class LuhnAlgorithmUtilTest {

    @Test
    public void testForValidMasterCardNumber_16digits() throws Exception {
        String validMasterCardNumber = "5105105105105100";
        Assert.assertEquals(true, LuhnAlgorithmUtil.isValidCardNumber(validMasterCardNumber));
    }

    @Test
    public void testForInvalidMasterCardNumber_16digits() throws Exception {
        String invalidMasterCardNumber = "5105105105105111";
        Assert.assertEquals(false, LuhnAlgorithmUtil.isValidCardNumber(invalidMasterCardNumber));
    }

    @Test
    public void testForValidVisaCardNumber_16digits() throws Exception {
        String validVisaCardNumber = "4012888888881881";
        Assert.assertEquals(true, LuhnAlgorithmUtil.isValidCardNumber(validVisaCardNumber));
    }

    @Test
    public void testForInvalidVisaCardNumber_16digits() throws Exception {
        String invalidVisaCardNumber = "4112888888882881";
        Assert.assertEquals(false, LuhnAlgorithmUtil.isValidCardNumber(invalidVisaCardNumber));
    }

    @Test
    public void testForValidVisaCardNumber_13digits() throws Exception {
        String validVisaCardNumber = "4222222222222";
        Assert.assertEquals(true, LuhnAlgorithmUtil.isValidCardNumber(validVisaCardNumber));
    }

    @Test
    public void testForInvalidVisaCardNumber_13digits() throws Exception {
        String invalidVisaCardNumber = "4222222222332";
        Assert.assertEquals(false, LuhnAlgorithmUtil.isValidCardNumber(invalidVisaCardNumber));
    }

    @Test
    public void testForValidAmericanExpressCardNumber_15digits() throws Exception {
        String validAmericanExpressCardNumber = "371449635398431";
        Assert.assertEquals(true, LuhnAlgorithmUtil.isValidCardNumber(validAmericanExpressCardNumber));
    }

    @Test
    public void testForInvalidAmericanExpressCardNumber_15digits() throws Exception {
        String invalidAmericanExpressCardNumber = "371549635398531";
        Assert.assertEquals(false, LuhnAlgorithmUtil.isValidCardNumber(invalidAmericanExpressCardNumber));
    }

    @Test
    public void testForValidAmericanExpressCorporateCardNumber_15digits() throws Exception {
        String validAmericanExpressCorporateCardNumber = "378734493671000";
        Assert.assertEquals(true, LuhnAlgorithmUtil.isValidCardNumber(validAmericanExpressCorporateCardNumber));
    }

    @Test
    public void testForInvalidAmericanExpressCorporateCardNumber_15digits() throws Exception {
        String invalidAmericanExpressCorporateCardNumber = "378734593671011";
        Assert.assertEquals(false, LuhnAlgorithmUtil.isValidCardNumber(invalidAmericanExpressCorporateCardNumber));
    }

    @Test
    public void testForValidAustralianBankCardNumber_16digits() throws Exception {
        String validAustralianBankCardNumber = "5610591081018250";
        Assert.assertEquals(true, LuhnAlgorithmUtil.isValidCardNumber(validAustralianBankCardNumber));
    }

    @Test
    public void testForInvalidAustralianBankCardNumber_16digits() throws Exception {
        String invalidAustralianBankCardNumber = "5610591081018251";
        Assert.assertEquals(false, LuhnAlgorithmUtil.isValidCardNumber(invalidAustralianBankCardNumber));
    }

    @Test
    public void testForValidDinersClubCardNumber_14digits() throws Exception {
        String validDinersClubCardNumber = "30569309025904";
        Assert.assertEquals(true, LuhnAlgorithmUtil.isValidCardNumber(validDinersClubCardNumber));
    }

    @Test
    public void testForInvalidDinersClubCardNumber_14digits() throws Exception {
        String invalidDinersClubCardNumber = "30569309025905";
        Assert.assertEquals(false, LuhnAlgorithmUtil.isValidCardNumber(invalidDinersClubCardNumber));
    }

    @Test
    public void testForValidDiscoverCardNumber_16digits() throws Exception {
        String validDiscoverCardNumber = "6011000990139424";
        Assert.assertEquals(true, LuhnAlgorithmUtil.isValidCardNumber(validDiscoverCardNumber));
    }

    @Test
    public void testForInvalidDiscoverCardNumber_16digits() throws Exception {
        String invalidDiscoverCardNumber = "6031000992139424";
        Assert.assertEquals(false, LuhnAlgorithmUtil.isValidCardNumber(invalidDiscoverCardNumber));
    }

    @Test
    public void testForValidJCBCardNumber_16digits() throws Exception {
        String validJCBCardNumber = "3566002020360505";
        Assert.assertEquals(true, LuhnAlgorithmUtil.isValidCardNumber(validJCBCardNumber));
    }

    @Test
    public void testForInvalidJCBCardNumber_16digits() throws Exception {
        String invalidJCBCardNumber = "4566224020360505";
        Assert.assertEquals(false, LuhnAlgorithmUtil.isValidCardNumber(invalidJCBCardNumber));
    }
}