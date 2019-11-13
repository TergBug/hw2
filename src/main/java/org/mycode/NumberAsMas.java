package org.mycode;

import java.util.Arrays;

public class NumberAsMas {
    private static final String messageIfWrongInSetMas = "Wrong set!";
    private static final String messageIfWrongNumber = "Need positive integer number";
    private static final String messageIfWrongNumAsMas = "Need positive integer [0-9] number";
    private static final String messageIfWrongNumAsMasSeniorLevel = "Need positive integer [1-9] number";
    private static final String messageMasLength = "Enter length of mas: ";
    private static final String messageEnterElement = "Enter element #: ";
    private static final String patternForNumbers = "\\d+";
    private static final String patternForNumAsMas = "[0-9]";
    private static final String patternForNumAsMasSeniorLevel = "[1-9]";
    private int[] mas;
    public NumberAsMas(boolean isUserEntersData){
        if (isUserEntersData) {
            mas = new int[InputDataClass.checkOfInput(patternForNumbers, messageMasLength, messageIfWrongNumber)];
            for (int i = 0; i < mas.length; i++) {
                if(i==0 && mas.length>1) mas[i] = InputDataClass.checkOfInput(patternForNumAsMasSeniorLevel, messageEnterElement.replace("#", String.valueOf(i)), messageIfWrongNumAsMasSeniorLevel);
                else mas[i] = InputDataClass.checkOfInput(patternForNumAsMas, messageEnterElement.replace("#", String.valueOf(i)), messageIfWrongNumAsMas);
            }
        }
        else mas = new int[0];
    }
    public int[] incrNumberAsMas(){
        if(mas==null || mas.length==0) return new int[0];
        for (int i = mas.length-1; i >= 0; i--) {
            if(mas[i]!=9){
                mas[i]++;
                break;
            }
            else mas[i] = 0;
        }
        if(mas[0]==0) {
            mas = new int[mas.length+1];
            mas[0] = 1;
        }
        System.out.println(Arrays.toString(mas));
        return mas;
    }
    public int[] getMas() {
        return mas;
    }
    public void setMas(int[] mas) {
        if(mas==null) mas = new int[0];
        for (int i = 0; i < mas.length; i++) {
            if((i==0 && mas.length>1 && !(mas[i]>=1 && mas[i]<=9)) || !(mas[i]>=0 && mas[i]<=9)) {
                System.out.println(messageIfWrongInSetMas);
                return;
            }
        }
        this.mas = mas;
    }
}
