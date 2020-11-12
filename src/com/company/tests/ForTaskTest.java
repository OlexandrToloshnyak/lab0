package com.company.tests;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import com.company.tasks.ForTask;

public class ForTaskTest {
/*
Дано целое число N (> 0). Найти сумму

N2 + (N + 1)2 + (N + 2)2 + … + (2·N)2
 */


    @Test
    public void checkEqualTest() {
        ForTask ForTask = new ForTask(5);
        double test_data[]={25.0, 36.0, 49.0, 64.0, 81.0};
        assertEquals(ForTask.calculate(),255.0);
    }

}


