package com.hillel;

public class taskFour {
    
    public static void main(String[] args) {
        
        if (args.length == 0) {
            System.out.println("Provide parametrs in format:'service' 'price'");
            return;
        }
        
        String service = args[0];
        int price = Integer.parseInt(args[1]);
        
        switch (service) {
            case "terrible":
                break;
            case "poor":
                price += price * 0.05;
                break;
            case "good":
                price += price * 0.1;
                break;
            case "great":
                price += price * 0.15;
                break;
            case "excellent":
                price += price * 0.2;
                break;
            default:
                System.out.println("If you want to see the price with tips choose the service(terrible/poor/good/great/excellent).");
        }
        
        System.out.println("Pay: " + price);
        
    }
}