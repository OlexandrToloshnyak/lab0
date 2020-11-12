package com.company.tests;

import com.company.tasks.MatrixTask;
import com.company.addons.MatrixAddon;
import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;

public class MatrixTaskTest {
/*
Matrix31. Дана матрица размера M ґ N.
Найти номера строки и столбца для элемента матрицы, наиболее близкого к среднему значению всех ее элементов.
 */


    @Test
    public void checkEqualTest() {
        MatrixAddon addon=new MatrixAddon(2,1);
        int[][] matrix = {
                {-9,1,0},
                {20,1,50},
                {-2,3,-10}
        };
        MatrixTask mat=new MatrixTask(3,3,matrix);
        assertEquals(mat.calculate(),addon,"Індекси не рівні");
    }

}


