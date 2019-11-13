package org.mycode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class MaxSubarrayTest {
    MaxSubarray maxSubarray = new MaxSubarray(false);
    int[] inputMas = new int[] {-2,1,-3,4,-1,2,1,-5,4};
    @Before
    public void setUp(){
        maxSubarray.setMas(inputMas);
    }
    @Test
    public void shouldSetInputMas() {
        assertArrayEquals(inputMas, maxSubarray.getMas());
    }
    @Test
    public void shouldCheckForNullAndEmptyMas() {
        maxSubarray.setMas(new int[0]);
        assertEquals(0, maxSubarray.searchMaxSubarray());
        maxSubarray.setMas(null);
        assertEquals(0, maxSubarray.searchMaxSubarray());
    }
    @Test
    public void shouldSearchMaxSumOfSubarray() {
        assertEquals(6, maxSubarray.searchMaxSubarray());
    }
}
