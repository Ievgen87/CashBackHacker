package ru.netology;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CashBackHackerTest {
    @Test
    public void calculateServiceCashBackDoNotNeeded() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);
    }

    @Test
    public void calculateMinCashBackNeeded() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void calculateCashBackDoNotNeeded() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }


}
