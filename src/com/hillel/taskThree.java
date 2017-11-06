package com.hillel;

import java.util.Scanner;

public class taskThree {
    
    public static void main(String[] args) {
    
        if (args.length == 0) {
            System.out.println("Enter 'operation(abs/addition/subtract/multiplication/division/remind)' 'num1' 'num2'");
        }
        
        String operation = args[0];
        int result = 0;
        
        if (operation.equals("abs")) {
            System.out.println("Enter your number: ");
            Scanner scanner = new Scanner(System.in);
            int operand = scanner.nextInt();
            System.out.println("Result of " + operation + " is: " + Math.abs(operand));
            return;
        } 
        
        int firstOperand = Integer.parseInt(args[1]);
        int secondOperand = Integer.parseInt(args[2]);
        
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