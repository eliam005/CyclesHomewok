package ru.netology.javaqa.PackageCyclesHomework.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcVacationServiceTest {

    @Test
    public void testCalculate() {

        CalcVacationService service = new CalcVacationService();

        int actual = service.calcVacation(10_000, 3_000, 20_000);
        int expected = 3;


        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testCalculate2() {

        CalcVacationService service = new CalcVacationService();

        int actual = service.calcVacation(100_000, 60_000, 150_000);
        int expected = 2;


        Assertions.assertEquals(actual, expected);
    }

}