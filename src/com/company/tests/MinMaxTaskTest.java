package com.company.tests;

import com.company.tasks.MinMaxTask;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class MinMaxTaskTest {
/*
Дано целое число N и набор из N целых чисел.
Найти номер последнего экстремального (то есть минимального или максимального) элемента из данного набора.
 */


    @Test
    public void checkEqualTest() {
        int test_data[]={23, 10, 41, 0,4,6};
        MinMaxTask minm=new MinMaxTask(5,test_data);
        assertEquals(minm.calculate(),3);
    }

}


