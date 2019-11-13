package org.mycode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class CheckForDuplicatesTest {
    CheckForDuplicates checkForDuplicates = new CheckForDuplicates(false);
    int[] inputMasWithoutDuplicates = new int[] {1,2,3,4};
    int[] inputMasWithDuplicates = new int[] {1,2,3,1,3,5};
    @Test
    public void shouldSetInputMas() {
        checkForDuplicates.setMas(inputMasWithoutDuplicates);
        assertArrayEquals(inputMasWithoutDuplicates, checkForDuplicates.getMas());
    }
    @Test
    public void shouldCheckForNullAndEmptyMas() {
        checkForDuplicates.setMas(new int[0]);
        assertEquals(false, checkForDuplicates.isMasHasDuplicates());
        checkForDuplicates.setMas(null);
        assertEquals(false, checkForDuplicates.isMasHasDuplicates());
    }
    @Test
    public void shouldCheckForDuplicates() {
        checkForDuplicates.setMas(inputMasWithoutDuplicates);
        assertEquals(false, checkForDuplicates.isMasHasDuplicates());
        checkForDuplicates.setMas(inputMasWithDuplicates);
        assertEquals(true, checkForDuplicates.isMasHasDuplicates());
    }
}
