package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    //1
    @org.junit.jupiter.api.Test
    void calculateSum() {
        StatsService service = new StatsService();
        int[] purchases = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = (int) service.calculateSum(purchases);
        assertEquals(expected, actual);
    }
    //2
    @Test
    void calculateAverageSum () {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.calculateAverageSum(purchases);
        assertEquals(expected, actual);
    }
    //3
    @Test
    void monthMaxSum () {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.monthMaxSum(purchases);
        assertEquals(expected, actual);
    }
    //4
    @Test
    void monthMinSum () {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.monthMinSum(purchases);
        assertEquals(expected, actual);
    }
    //5
    @Test
    void monthAverageMinSum () {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.monthAverageMinSum(purchases);
        assertEquals(expected, actual);
    }
    //6
    @Test
    void monthAverageMaxSum () {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.monthAverageMaxSum(purchases);
        assertEquals(expected, actual);
    }


}