package InClassWork;

import java.util.Scanner;

/**
 * Created by user on 6/27/2017.
 */

public class WeekOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a age: ");
        String age = input.nextLine();

        Integer.parseInt(age);

        System.out.print("Enter an name: ");
        String name = input.nextLine();

        System.out.println(name + " " + age);


        int newAge = 33;
        int newestAge;
        newestAge = 34;

        input.close();
    }
}
