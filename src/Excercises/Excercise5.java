package Excercises;

import java.util.Scanner;

public class Excercise5 {
    public static void main(String[] args) {
        double num1;
        double num2;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num1 = input.nextDouble();
        System.out.print("Enter another number: ");
        num2 = input.nextDouble();
        System.out.print("The product is " + (num1 * num2));
    }
}
