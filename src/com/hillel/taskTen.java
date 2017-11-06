package com.hillel;

public class taskTen {
    
    public static void main(String[] args) {
        
        int[] array = new int [10];
        int max = 0;
        int min = 0;
        
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random()*40) - 20);
            System.out.print(array[i] + " ");
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        
        System.out.println("\n" + "Max elem is: " + max + " Min elem is: " + min);
        
    }
}