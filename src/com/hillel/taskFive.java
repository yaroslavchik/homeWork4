package com.hillel;

public class taskFive {
    
    public static void main(String[] args) {
        
        /*int[] array = new int[30];
                
        for (int i = 1, b = 970; i < array.length; i++, b += 3) {
            array[i] = b;
            
            if (array[i] / 10 > 99) {
                System.out.println(array[i]);
            }
        }*/
        
        int a = 997;
        while (a < 11000) {
            a += 3;
            if (a / 10 > 99 && a < 9999) {
                System.out.println(a);
            }
        }
    }
}