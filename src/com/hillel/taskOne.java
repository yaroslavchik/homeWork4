package com.hillel;

public class taskOne {
    
    public static void main(String[] args) {
        
        String operation = "subtract";
        int firstOperand = 15;
        int secondOperand = 12;
        int result = 0;
        
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
        }
        
        System.out.println("Result of " + operation + " is " + result);
    }
}