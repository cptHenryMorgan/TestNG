package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateRemain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = cashbackHackService.remain(amount);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateRemainWith1() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1;
        int expected = 999;
        int actual = cashbackHackService.remain(amount);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateRemainWith999() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = cashbackHackService.remain(amount);
        Assert.assertEquals(actual, expected);
    }
}