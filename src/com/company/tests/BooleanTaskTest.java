package com.company.tests;

import org.testng.annotations.Test;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import com.company.tasks.BooleanTask;

public class BooleanTaskTest {
/*
Даны два целых числа: A, B.
Проверить истинность высказывания: «Числа A и B имеют одинаковую четность».
 */


    @Test
    public void checkTrueTest() {
        BooleanTask BooleanTask = new BooleanTask(2,2);
        assertTrue(BooleanTask.check());
    }

    @Test
    public void checkTrueTestFalse() {
        BooleanTask BooleanTask = new BooleanTask(2,5);
        assertFalse(BooleanTask.check());
    }
}


