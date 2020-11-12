package com.company.tests;

import com.company.tasks.WhileTask;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class WhileTaskTest {
/*
Дано целое число N (> 1).
Вывести наименьшее из целых чисел K, для которых сумма 1 + 2 + … + K будет больше или равна N, и саму эту сумму.
 */


    @Test
    public void checkEqualTest() {
        WhileTask wh=new WhileTask(10);
        assertEquals(wh.calculate(),3);
    }

}


