package org.mycode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class SumPairTargetTest {
    SumPairTarget sumPairTarget = new SumPairTarget(false);
    int[] inputMas = new int[] {2, 7, 11, 15};
    int targetNum = 9;
    @Before
    public void setUp(){
        sumPairTarget.setMas(inputMas);
        sumPairTarget.setTargetNum(targetNum);
    }
    @Test
    public void shouldSetInputMas() {
        assertArrayEquals(inputMas, sumPairTarget.getMas());
        assertEquals(targetNum, sumPairTarget.getTargetNum());
    }
    @Test
    public void shouldCheckForNullAndEmptyMas() {
        sumPairTarget.setMas(new int[0]);
        assertArrayEquals(new int[0], sumPairTarget.getSumPairTarget());
        sumPairTarget.setMas(null);
        assertArrayEquals(new int[0], sumPairTarget.getSumPairTarget());
    }
    @Test
    public void shouldGivePairOfIndexElementsAddUpToTarget() {
        assertArrayEquals(new int[]{0,1}, sumPairTarget.getSumPairTarget());
    }
}
