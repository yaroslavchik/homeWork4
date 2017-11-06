package com.hillel;

public class taskEleven {
    
    public static void main(String[] args) {
        
        int[] array = new int[10];
        int sumOfEven = 0;
        int sumOfOdd = 0;
        
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 40) - 20);
            System.out.print(array[i] + " ");
            
            if (array[i] % 2 == 0) {
                sumOfEven += array[i];
            } else {
                sumOfOdd += array[i];
            }
        }
        
        System.out.println("\n" + "Sum of Even= " + sumOfEven + " Sum of Odd= " + sumOfOdd);
        
    }
}