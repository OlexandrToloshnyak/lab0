package com.company.tests;

import com.company.tasks.CaseTask;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class CaseTaskTest {
/*
Локатор ориентирован на одну из сторон света («С» — север, «З» — запад, «Ю» — юг, «В» — восток)
и может принимать три цифровые команды поворота: 1 — поворот налево, –1 — поворот направо, 2 — поворот на 180^o.
Дан символ C — исходная ориентация локатора и целые числа N_1 и N_2 — две посланные команды.
Вывести ориентацию локатора после выполнения этих команд.
 */


    @Test
    public void checkEqualTest() {
        CaseTask cs=new CaseTask('С',1,2);
        cs.calculate();
        assertEquals(cs.getC(),'В');
    }

}


