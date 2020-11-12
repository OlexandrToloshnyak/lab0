package com.company.tests;

import com.company.tasks.ArrayTask;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class ArrayTaskTest {
/*
Дан массив A размера N и целое число K (1 Ј K Ј N).
Вывести элементы массива с порядковыми номерами, кратными K: AK, A2·K, A3·K, … .
Условный оператор не использовать.
 */


    @Test
    public void checkEqualTest() {
        int test_data[]={23, 10, 41, 0,4,6,4,1,2,5};
        int exp[]={10, 0, 6, 1};
        ArrayTask arr=new ArrayTask(9,2,test_data);
        assertEquals(arr.calculate(),exp);
    }

}


