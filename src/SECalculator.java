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

        double number1 = getNumber(scanner, "Enter the first number: ");
        String operator = getOperator(scanner);
        double number2 = getNumber(scanner, "Enter the second number: ");

        double result = calculate(number1, number2, operator);
        System.out.println("Result: " + result);

        // Scanner needs to be closed to free resources!
        scanner.close();
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
