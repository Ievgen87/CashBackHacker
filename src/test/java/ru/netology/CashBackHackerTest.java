package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashBackHackerTest {
    @Test
    public void calculateCashBackNeeded() {
        CashbackHackService service = new CashbackHackService();
        int amount = 200;

        int actual = service.remain(amount);
        int expected = 800;

        assertEquals(actual,expected);
    }

    @Test
    public void calculateCashBackDoNotNeeded() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual,expected);
    }
}
