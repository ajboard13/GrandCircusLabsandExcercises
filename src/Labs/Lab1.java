package Labs;

import java.util.Objects;
import java.util.Scanner;

import static java.lang.System.*;


public class Lab1 {

    public static void main(String[] args) {
        Double length;
        Double width;
        Double height;
        boolean userCont;

        Scanner input = new Scanner(in);

        out.println("Welcome to Grand Circus' Room Detail Generator!");

        do {
            out.print("\nEnter Length: ");
            length = input.nextDouble();
            out.print("Enter Width: ");
            width = input.nextDouble();
            out.print("Enter height: ");
            height = input.nextDouble();
            out.println("Area: " + length * width);
            out.println("Perimeter: " + (length * 2 + width * 2));
            out.println("Volume: " + length * width * height);
            out.print("\nContinue?(y/n) ");
            userCont = Objects.equals(input.next().toLowerCase(), "y");
        } while (userCont);

        out.println("Goodbye!");
    }

}
