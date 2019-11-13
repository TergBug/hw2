package org.mycode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class RemoveElementTest {
    RemoveElement removeElement = new RemoveElement(false);
    int[] inputMas = new int[] {0,1,2,2,3,0,4,2};
    int removedNum = 2;
    @Before
    public void setUp(){
        removeElement.setMas(inputMas);
        removeElement.setRemovedNum(removedNum);
    }
    @Test
    public void shouldSetInputMas() {
        assertArrayEquals(inputMas, removeElement.getMas());
        assertEquals(removedNum, removeElement.getRemovedNum());
    }
    @Test
    public void shouldCheckForNullAndEmptyMas() {
        removeElement.setMas(new int[0]);
        assertEquals(-1, removeElement.removeElement());
        removeElement.setMas(null);
        assertEquals(-1, removeElement.removeElement());
    }
    @Test
    public void shouldGiveNewLengthOfMasAfterRemoveElem() {
        assertEquals(5, removeElement.removeElement());
    }
}
