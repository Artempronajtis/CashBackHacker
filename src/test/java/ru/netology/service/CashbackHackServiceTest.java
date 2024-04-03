package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void testRemainBoundaryReached() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int expectedRemain = 0;
        int actualRemain = cashbackHackService.remain(amount);
        Assert.assertEquals(actualRemain, expectedRemain);
    }

    @Test
    public void testRemainBoundaryNotReached() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 800;
        int expectedRemain = 200;
        int actualRemain = cashbackHackService.remain(amount);
        Assert.assertEquals(actualRemain, expectedRemain);
    }

    @Test
    public void testRemainExtraNeeded() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;
        int expectedRemain = 100;
        int actualRemain = cashbackHackService.remain(amount);
        Assert.assertEquals(actualRemain, expectedRemain);
    }
}


