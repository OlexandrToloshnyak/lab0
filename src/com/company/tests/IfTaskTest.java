package com.company.tests;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import com.company.tasks.IfTask;

public class IfTaskTest {
    /*
    Даны две переменные целого типа: A и B.
    Если их значения не равны, то присвоить каждой переменной большее из этих значений,
    а если равны, то присвоить переменным нулевые значения. Вывести новые значения переменных A и B.
     */



    @Test
    public void checkEqualTest() {
        IfTask IfTask = new IfTask(2,2);
        IfTask.comparison();
        assertEquals(IfTask.getFirstNumber()==0,IfTask.getSecondNumber()==0);
    }

    @Test
    public void checkNotEqualTest() {
        IfTask IfTask = new IfTask(2,5);
        IfTask.comparison();
        assertEquals(IfTask.getFirstNumber()==5,IfTask.getSecondNumber()==5);
    }
}


