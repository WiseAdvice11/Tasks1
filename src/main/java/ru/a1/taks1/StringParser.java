package ru.a1.taks1;

public class StringParser {
    /**
     * Напишите программу, которая возвращает сумму цифр, присутствующих в данной строке.
     * Если цифр нет, то возвращаемая сумма должна быть равна 0.
     */


    public static int  extractSumFromString (String digits){
        int sum = 0;
        if (digits.isEmpty()){
            return 0;
        }
        else {
            sum += Character.getNumericValue(digits.charAt(0)) + extractSumFromString(digits.substring(1));
            return sum;
        }
    }

    public static void main(String[] args) {
        System.out.println(extractSumFromString("445"));
    }
}
