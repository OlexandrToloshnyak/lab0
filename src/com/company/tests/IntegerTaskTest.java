package com.company.tests;

import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
import com.company.tasks.IntegerTask;

public class IntegerTaskTest {
/*
Дано трехзначное число. Найти сумму и произведение его цифр.
 */

    @Test
    public void checkSumTest() {
        IntegerTask IntegerTask = new IntegerTask(232);
        IntegerTask.calculate();
        assertTrue(IntegerTask.sum()==7);
    }

    @Test
    public void checkMultTest() {
        IntegerTask IntegerTask = new IntegerTask(232);
        IntegerTask.calculate();
        assertTrue(IntegerTask.multiplication() == 12);
    }
}
