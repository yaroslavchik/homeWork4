package com.hillel;

import java.util.Scanner;

public class taskTwo {
    
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter operation(abs/addition/subtract/multiplication/division/remind)");
        String operation = scanner.nextLine();
        int result = 0;
        
        if (operation.equals("abs")) {
            System.out.println("Enter your number: ");
            int operand = scanner.nextInt();
            System.out.println("Result of " + operation + " is: " + Math.abs(operand));
            return;
        } 
        
        System.out.println("Enter your first number: ");
        int firstOperand = scanner.nextInt();
        System.out.println("Enter your second number: ");
        int secondOperand = scanner.nextInt();
        
        switch (operation) {
            case "addition":
                result = firstOperand + secondOperand;
                break; 
            case "subtract":
                result = firstOperand - secondOperand;
                break;
            case "multiplication":
                result = firstOperand * secondOperand;
                break;
            case "division":
                result = firstOperand / secondOperand;
                break;
            case "remind":
                result = firstOperand % secondOperand;
                break;
            default:
                System.out.println("Choose opertaion");
                break;
        }
        
        System.out.println("Result of " + operation + " is " + result);
    }
}