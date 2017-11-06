package com.hillel;

public class taskSix {
    
    public static void main(String[] args) {
        
        int[] array = new int[70];
        array[0] = 1;
        
        for (int i = 0, b = 1; i < array.length; i++, b += 2) {
            array[i] = b;
        }
        
        for (int i = 0; i < 55; i++) {
            System.out.println(i + " elem is: " + array[i]);
        }
    }
}