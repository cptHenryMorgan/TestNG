package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void shouldCalculateRemain() {
        int amount = 850;
        int expected = 150;
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateRemainWith999() {
        int amount = 999;
        int expected = 1;
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);

    }

    @Test
    public void shouldCalculateRemainWith1() {
        int amount = 1;
        int expected = 999;
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);

    }
}