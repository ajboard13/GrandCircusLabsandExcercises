package Excercises;

import java.util.Objects;
import java.util.Scanner;

public class Excercise6 {
    public static void main(String[] args) {
        boolean userCont;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Hello, World!");
            System.out.print("Would you like to continue (y/n)?");
            userCont = Objects.equals(input.next().toLowerCase(), "y");
        }while (userCont);

        System.out.println("Goodbye!");
    }
}
