package org.mycode;

public class CheckForDuplicates {
    private static final String messageIsMasHasDuplicates = "Are there duplicates: ";
    private int[] mas;
    public CheckForDuplicates(boolean isUserEntersData){
        if (isUserEntersData) mas = InputDataClass.inputData();
        else mas = new int[0];
    }
    public boolean isMasHasDuplicates(){
        if(mas==null || mas.length==0) return false;
        for (int i = 0; i < mas.length; i++) {
            for (int j = i+1; j < mas.length; j++) {
                if(mas[i] == mas[j]){
                    System.out.println(messageIsMasHasDuplicates+true);
                    return true;
                }
            }
        }
        System.out.println(messageIsMasHasDuplicates+false);
        return false;
    }
    public int[] getMas() {
        return mas;
    }
    public void setMas(int[] mas) {
        this.mas = mas;
    }
}
