package org.mycode;

import java.util.Arrays;

public class RemoveElement {
    private static final String messageIfWrongNumber = "Need integer number";
    private static final String messageRemovedNum = "Enter removed number: ";
    private static final String messageNewLength = "New length: ";
    private static final String patternForNumbers = "-?\\d+";
    private int[] mas;
    private int removedNum;
    public RemoveElement(boolean isUserEntersData){
        if (isUserEntersData) {
            removedNum = InputDataClass.checkOfInput(patternForNumbers, messageRemovedNum, messageIfWrongNumber);
            mas = InputDataClass.inputData();
        }
        else {
            removedNum = 0;
            mas = new int[5];
        }
    }
    public int removeElement(){
        if(mas==null || mas.length==0) return -1;
        int newLength = mas.length;
        for (int i = 0; i < newLength;) {
            if(mas[i]==removedNum){
                for (int j = i; j < mas.length-1; j++) mas[j] = mas[j+1];
                newLength--;
            }
            else i++;
        }
        System.out.println(Arrays.toString(Arrays.copyOf(mas, newLength)));
        System.out.println(messageNewLength+newLength);
        return newLength;
    }
    public int[] getMas() {
        return mas;
    }
    public void setMas(int[] mas) {
        this.mas = mas;
    }
    public int getRemovedNum() {
        return removedNum;
    }
    public void setRemovedNum(int removedNum) {
        this.removedNum = removedNum;
    }
}
