package org.mycode;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class InputDataClass {
    private static final String messageIfWrongNumber = "Need integer number";
    private static final String messageIfWrongChoose = "Need 1 or 2";
    private static final String messageMasLength = "Enter length of mas: ";
    private static final String messageRandomMas = "1. Random filling of mas\n";
    private static final String messageHandleMas = "2. Manual filling of mas\n";
    private static final String messageEnterElement = "Enter element #: ";
    private static final String patternForNumbers = "-?\\d+";
    private static final String patternForMasLength = "\\d+";
    private static final String patternForChooseBetweenTwo = "[1-2]";
    public static int[] inputData(){
        int[] mas = new int[checkOfInput(patternForMasLength, messageMasLength, messageIfWrongNumber)];
        switch (checkOfInput(patternForChooseBetweenTwo, messageRandomMas+messageHandleMas, messageIfWrongChoose)) {
            case 1:
                fillRandomMas(mas);
                break;
            case 2:
                fillInputMas(mas);
                break;
        }
        System.out.println("\n"+ Arrays.toString(mas));
        return mas;
    }
    public static void fillRandomMas(int[] mas){
        Random r = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = r.nextBoolean() ? r.nextInt(100) : -r.nextInt(100);
        }
    }
    public static void fillInputMas(int[] mas){
        for (int i = 0; i < mas.length; i++) {
            mas[i] = checkOfInput(patternForNumbers, messageEnterElement.replace("#", String.valueOf(i)), messageIfWrongNumber);
        }
    }
    public static int checkOfInput(String pattern, String shownText, String shownTextIfWrong){
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print(shownText);
            if(!scanner.hasNext(pattern)){
                scanner.next();
                System.out.println(shownTextIfWrong);
                continue;
            }
            return scanner.nextInt();
        }while (true);
    }
}
