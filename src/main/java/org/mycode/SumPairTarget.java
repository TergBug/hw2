package org.mycode;

import java.util.Arrays;

public class SumPairTarget {
    private static final String messageIfWrongNumber = "Need integer number";
    private static final String messageTargetNum = "Enter target (pair sum) number: ";
    private static final String messageIndexOfTwoNum = "Index of two numbers that add up to target: ";
    private static final String patternForNumbers = "-?\\d+";
    private int[] mas;
    private int targetNum;
    public SumPairTarget(boolean isUserEntersData){
        if (isUserEntersData) {
            targetNum = InputDataClass.checkOfInput(patternForNumbers, messageTargetNum, messageIfWrongNumber);
            mas = InputDataClass.inputData();
        }
        else {
            targetNum = 0;
            mas = new int[0];
        }
    }
    public int[] getSumPairTarget(){
        if(mas==null || mas.length==0) return new int[0];
        int[] indexes = new int[2];
        for (int i = 0; i < mas.length; i++) {
            for (int j = i; j < mas.length; j++) {
                if(mas[i]+mas[j]==targetNum){
                    indexes[0] = i;
                    indexes[1] = j;
                    System.out.println(messageIndexOfTwoNum +Arrays.toString(indexes));
                    return indexes;
                }
            }
        }
        return null;
    }
    public int[] getMas() {
        return mas;
    }
    public void setMas(int[] mas) {
        this.mas = mas;
    }
    public int getTargetNum() {
        return targetNum;
    }
    public void setTargetNum(int targetNum) {
        this.targetNum = targetNum;
    }
}
