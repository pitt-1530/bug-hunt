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
        System.out.println("|  _________________  |\n| | JO           0. | |\n| |_________________| |\n|  ___ ___ ___   ___  |\n| | 7 | 8 | 9 | | + | |\n| |___|___|___| |___| |\n| | 4 | 5 | 6 | | - | |\n| |___|___|___| |___| |\n| | 1 | 2 | 3 | | x | |\n| |___|___|___| |___| |\n| | . | 0 | = | | / | |\n| |___|___|___| |___| |\n|_____________________|");

        double number1 = getNumber(scanner, "Enter the first number: ");
        String operator = getOperator(scanner);
        double number2 = getNumber(scanner, "Enter the second number: ");

        double result = calculate(number1, number2, operator);
        System.out.println("Result: " + result);

        // Scanner needs to be closed to free resources
        scanner.close();
        System.out.println("Thank you for using SECalculator!");
    }

    public static double getNumber(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public static String getOperator(Scanner scanner) {
        System.out.print("Enter operator (+ or - or / or %): ");
        return scanner.next();
    }

    public static double calculate(double number1, double number2, String operator) {
        double result = 0;
        boolean validOperator = true;
        Scanner scanner = new Scanner(System.in);

        // loops on invalid input and user can input new operator
        while(validOperator) {
            if (operator.equals("+")) {
                validOperator = false;
                result = number1 + number2;
            } else if (operator.equals("-")) {
                validOperator = false;
                result = number1 - number2;
            } else if (operator.equals("/")) {
                validOperator = false;
                result = number1 / number2;
            } else {
                System.out.println("Unknown operator");
                operator = getOperator(scanner);
            }

