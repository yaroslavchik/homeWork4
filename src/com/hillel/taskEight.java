package com.hillel;

public class taskEight {
    
    public static void main(String[] args) {
        
        int[] array = new int[25];
        
        for (int i = 0, b = 2; i < array.length; i++, b *= 2) {
            array[i] = b;
        }
        
        for (int i = 0; i < 20; i++) {
            System.out.println(i + " elem is: " + array[i]);
        }
        
    }
}