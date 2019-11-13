package org.mycode;

import java.util.Arrays;

public class MaxSubarray {
    private static final String messageMaxSubarray = "Max subarray: ";
    private static final String messageMaxSum = "Max subarray sum: ";
    private int[] mas;
    public MaxSubarray(boolean isUserEntersData){
        if(isUserEntersData) mas = InputDataClass.inputData();
        else mas = new int[0];
    }
    public int searchMaxSubarray(){
        if(mas==null || mas.length==0) return 0;
        int sum = mas[0];
        int maxSum = mas[0];
        int startIndex = 0;
        int lastIndex = 0;
        for (int i = 1; i < mas.length; i++) {
            sum += mas[i];
            if(sum<0) sum = 0;
            if(sum>0 && maxSum<sum){
                maxSum = sum;
                lastIndex = i;
            }
            else if(maxSum<mas[i]){
                maxSum = mas[i];
                startIndex = i;
                lastIndex = i;
            }
            if(sum-mas[i]==0 && maxSum==sum) startIndex = i;
        }
        int[] maxSubarray = Arrays.copyOfRange(mas, startIndex, lastIndex+1);
        System.out.println(messageMaxSubarray+Arrays.toString(maxSubarray));
        System.out.println(messageMaxSum+maxSum);
        return maxSum;
    }
    public void setMas(int[] mas) {
        this.mas = mas;
    }
    public int[] getMas() {
        return mas;
    }
}
