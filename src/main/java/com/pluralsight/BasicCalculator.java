package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double firstNum = input.nextInt();

        System.out.print("Enter the second number: ");
        double secondNum = input.nextInt();

        double multipliedNum = firstNum * secondNum;
        System.out.println(firstNum + " * " + secondNum + " = " + multipliedNum);

        input.close();

    }
}
