package com.hillel;

public class taskNine {
    
    public static void main(String[] args) {
        
        if (args.length == 0) {
            System.out.println("How much elements you want to print ? (0-20)");
            return;
        }
        
        int n = Integer.parseInt (args[0]);
        
        int[] array = new int[20];
        
        for (int i = 0; i < array.length; i++) {
             array[i] = ((int)(Math.random() * 61) - 30);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }    
    }
}