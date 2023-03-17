package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class VacationCalcServiceTest {
    @Test
    public void testIncome10000() {
        VacationCalcService service = new VacationCalcService();
        int actual = service.calculate(10_000, 3_000, 20_000);
        int expected = 3;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void testIncome100000() {
        VacationCalcService service = new VacationCalcService();
        int actual = service.calculate(100_000, 60_000, 150_000);
        int expected = 2;

        Assertions.assertEquals(actual, expected);
    }
}
