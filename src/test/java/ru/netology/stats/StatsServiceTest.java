package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {

    @Test
    public void GetSumAmount() {

        StatsService service = new StatsService();
        int[] amount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.getSum_Sales(amount);

        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test
    public void GetMediumSalesPerMonth() {
        StatsService service = new StatsService();
        int[] amount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMedium = (8+15+13+15+17+20+19+20+7+14+14+18)/amount.length;
        int actualMedium = service.getMediumSalesPerMonth(amount);
        Assertions.assertEquals(expectedMedium, actualMedium);
    }

    @Test
    public void getMaxMonthSales() {
        StatsService service = new StatsService();
        int[] amount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxMonth = 7;
        int actualMaxMonth = service.getMaxMonthSales(amount);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void getMinMonthSales() {
        StatsService service = new StatsService();
        int[] amount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonth = 8;
        int actualMinMonth = service.getMinMonthSales(amount);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void getMinMediumSales() {
        StatsService service = new StatsService();
        int[] amount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMediumSales = 5;
        int actualMinMediumSales = service.getMinMediumSales(amount);

        Assertions.assertEquals(expectedMinMediumSales, actualMinMediumSales);
    }

    @Test
    public void getMaxMediumSales() {
        StatsService service = new StatsService();
        int[] amount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxMediumSales = 5;
        int actualMaxMediumSales = service.getMaxMediumSales(amount);

        Assertions.assertEquals(expectedMaxMediumSales, actualMaxMediumSales);
    }



}

