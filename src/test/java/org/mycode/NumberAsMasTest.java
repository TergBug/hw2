package org.mycode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class NumberAsMasTest {
    NumberAsMas numberAsMas = new NumberAsMas(false);
    int[] simpleCase = new int[] {1,2,3};
    int[] simpleCaseTarget = new int[] {1,2,4};
    int[] wrongCaseFirstZero = new int[] {0,2,5};
    int[] wrongCaseNegativeNum = new int[] {2,-2,5};
    int[] wrongCaseMoreThenNineNum = new int[] {5,2,52};
    int[] specialCase1 = new int[] {5,9,9,9};
    int[] specialCase1Target = new int[] {6,0,0,0};
    int[] specialCase2 = new int[] {9,9,9,9};
    int[] specialCase2Target = new int[] {1,0,0,0,0};
    @Before
    public void setUp(){
        numberAsMas.setMas(simpleCase);
    }
    @Test
    public void shouldSetInputMas() {
        assertArrayEquals(simpleCase, numberAsMas.getMas());
    }
    @Test
    public void shouldCheckForWrongInput() {
        numberAsMas.setMas(wrongCaseFirstZero);
        Assert.assertFalse(numberAsMas.getMas().equals(new int[] {0,2,5}));
        numberAsMas.setMas(wrongCaseNegativeNum);
        Assert.assertFalse(numberAsMas.getMas().equals(new int[] {0,2,5}));
        numberAsMas.setMas(wrongCaseMoreThenNineNum);
        Assert.assertFalse(numberAsMas.getMas().equals(new int[] {0,2,5}));
    }
    @Test
    public void shouldCheckForNullAndEmptyMas() {
        numberAsMas.setMas(new int[0]);
        assertArrayEquals(new int[0], numberAsMas.incrNumberAsMas());
        numberAsMas.setMas(null);
        assertArrayEquals(new int[0], numberAsMas.incrNumberAsMas());
    }
    @Test
    public void shouldIncrNumAsMas() {
        assertArrayEquals(simpleCaseTarget, numberAsMas.incrNumberAsMas());
    }
    @Test
    public void shouldIncrNumAsMasSpecialCase() {
        numberAsMas.setMas(specialCase1);
        assertArrayEquals(specialCase1Target, numberAsMas.incrNumberAsMas());
        numberAsMas.setMas(specialCase2);
        assertArrayEquals(specialCase2Target, numberAsMas.incrNumberAsMas());
    }
}
