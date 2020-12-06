package ru.netology.Servis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticServisTest {

    public StatisticServis servis = new StatisticServis();
    public int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void shouldTotalSales() {
        int expected = 180;
        int actual = servis.totalSales(sales); // sales
        // производим проверку
        assertEquals(expected, actual);
    }

    @Test
    void shouldAverageSalesPerMonth() {
        int expected = 15;
        int actual = servis.averageSalesPerMonth(sales); // sales
        // производим проверку
        assertEquals(expected, actual);
    }

    @Test
    void showMonthInWhichSalesMax() {
        int expected = 6;
        int actual = servis.monthInWhichSalesMax(sales); // sales
        // производим проверку
        assertEquals(expected, actual);
    }

    @Test
    void showMonthInWhichSalesMin() {
        int expected = 9;
        int actual = servis.monthInWhichSalesMin(sales); // sales
        // производим проверку
        assertEquals(expected, actual);
    }

    @Test
    void showNumberOfMonthsBelowAverage() {
        int expected = 5;
        int actual = servis.numberOfMonthsBelowAverage(sales); // sales
        // производим проверку
        assertEquals(expected, actual);
    }

    @Test
    void showNumberOfMonthsAboveAverage() {
        int expected = 5;
        int actual = servis.numberOfMonthsAboveAverage(sales); // sales
        // производим проверку
        assertEquals(expected, actual);
    }


}