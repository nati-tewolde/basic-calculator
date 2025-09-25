package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNum = input.nextInt();

        System.out.print("Enter the second number: ");
        int secondNum = input.nextInt();

        int multipliedNum = firstNum * secondNum;
        System.out.println(firstNum + " * " + secondNum + " = " + multipliedNum);

    }
}
