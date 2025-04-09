/*
 * Created on 2025-04-01
 *
 * Copyright (c) 2025 Nadine von Frankenberg
 */

import java.util.Scanner;

public class SECalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to SECalculator!");

        while (true){
            System.out.print("Enter the first number (or type 'clear'): ");
            String input1 = scanner.next();
            if (input1.equalsIgnoreCase("clear")) continue;

            double number1 = Double.parseDouble(input1);

            System.out.print("Enter operator (+ or - or /): ");
            String operator = scanner.next();
            if (operator.equalsIgnoreCase("clear")) continue;

            System.out.print("Enter the second number (or type 'clear'): ");
            String input2 = scanner.next();
            if (input2.equalsIgnoreCase("clear")) continue;

            double number2 = Double.parseDouble(input2);

            double result = calculate(number1, number2, operator);
            System.out.println("Result: " + result);
            break;

        }
    }

    public static double getNumber(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public static String getOperator(Scanner scanner) {
        System.out.print("Enter operator (+ or - or /): ");
        return scanner.next();
    }

    public static double calculate(double number1, double number2, String operator) {
        double result = 0;

        if (operator.equals("+")) {
            result = number1 + number2;
        } else if (operator.equals("-")) {
            result = number1 - number2;
        } else if (operator.equals("/")) {
            result = number1 / number2;
        } else {
            System.out.println("Unknown operator");
        }

        return result;
    }
}
