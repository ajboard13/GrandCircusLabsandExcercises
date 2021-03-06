package BonusWork.PersonClasses;

import java.util.Scanner;

/**
 * Created by user on 6/29/2017.
 */
public class PersonTest {
    static Scanner input = new Scanner(System.in);
    static int userInt = 0;
    static String toStringResult;

    public static void main(String[] args) {
        boolean userCont;

        do {
            toStringResult = "";
            checkForValidInt();
            chosePersonType();
            System.out.println(toStringResult);
            System.out.println("\nWould you like to go again? (y/n)");
            userCont = input.next().equalsIgnoreCase("y");
        } while (userCont);

    }

    private static int checkForValidInt() {
        System.out.println("which type of person are you? \n1 for Staff\n2 for student\n3 for ordinary person");
        while (!input.hasNextInt()) {
            System.out.println("not a valid choice! \nwhich type of person are you? \n1 for Staff\n2 for student\n3 for ordinary person ");
            input.nextLine();
        }
        userInt = input.nextInt();
        return userInt;
    }

    private static void chosePersonType() {
        switch (userInt) {
            case 1:
                Staff staff = new Staff("Aaron", "2736 drive", "college university", 1000000.00);
                toStringResult = staff.toString();
                break;
            case 2:
                Student student = new Student("Aaron", "2345 street", 1987, "Java", 10.00);
                toStringResult = student.toString();
                break;
            case 3:
                Person person = new Person("Aaron", "2345 street");
                toStringResult = person.toString();
                break;
            default:
                System.out.println("not a valid choice!");
                break;
        }
    }
}
