package InClassWork;

import java.util.Scanner;

/**
 * Created by user on 6/30/2017.
 */
public class Day5Exceptions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //this program will catch for invalid input.

        String choice = "y";

        while (choice.equalsIgnoreCase("y")){

            System.out.println("Enter a monthly investment: ");

            double monthlyInv;
            try{
                String line = input.nextLine();
                monthlyInv = Double.parseDouble(line);
            }catch (NumberFormatException e){
                System.out.println(e.toString());
            }

            System.out.println("Continue? (y/n): ");
            choice = input.nextLine();
        }
    }
}
