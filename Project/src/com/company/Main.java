package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] CustomerOrder = new String[6];
        String[] Toppings = {"Sprinkles", "Coconut", "Chocolate Chips",
                "Marshmallows", "Fudge"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the the IS Ice Cream Shop");
        System.out.println("Which type of IceCream would you like? \n" +
                "\nChocolate " +
                "\nVanilla" +
                "\nStrawberry");


        String userInput = scanner.nextLine();
        CustomerOrder[0] = userInput + " Ice Cream";

        System.out.println("Please pick a topping or type in STOP. You are allowed up to 5 toppings");
        int ToppingCounter = 0;

        while (ToppingCounter < 5 && !userInput.equals("STOP")) {
            for (int i = 0; i < 5; i++) {
                System.out.println(Toppings[i]);
            }
            userInput = scanner.nextLine();
            if (!userInput.equals("STOP")) {
                ToppingCounter++;
                CustomerOrder[ToppingCounter] = userInput;
            }

        }
        System.out.println("Your order is: ");
        System.out.println(CustomerOrder[0] + " with");
        for (int j = 1; j < 6; j++) {
            if (CustomerOrder[j] != null) {
                System.out.print(CustomerOrder[j] + " ");
            }
        }
    System.out.println("Total Cost: " + (ToppingCounter + 5));
    }

}