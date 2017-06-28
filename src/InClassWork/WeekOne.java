package InClassWork;

import java.util.Scanner;


public class WeekOne {

    public static void main(String[] args) {
        day3();
    }

    private static void day2(){
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


        //implicit casting example

        double grade = 93;

        System.out.println(grade);

        double d = 95.0;
        int i = 86;
        int j = 91;

        double average = (d+i+j) /3;
        System.out.println(average);


        //explicit casting example

        int grade2 = (int) 93.75;
        System.out.println(grade2);

        if (grade2 > 100 || grade2 < 150){
            System.out.println("you picked a number between 100 and 150");
        }

        String day = "Tuesday";

        switch (day){
            case "Monday":
                System.out.println("Today is Monday");
                break;
            case "Tuesday":
                System.out.println("Today is Tuesday");
                break;
            case "Wednesday":
                System.out.println("Today is Wednesday");
                break;
            case "Thursday":
                System.out.println("Today is Thursday");
                break;
            case "Friday":
                System.out.println("Today is Friday");
                break;
            case "Saturday":
                System.out.println("Today is Saturday");
                break;
            case "Sunday":
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("No day selected");
                break;
        }

    }

    private static void day3(){
        System.out.println("Hello World");
        Scanner input = new Scanner(System.in);

        String choice = "y";
        while (choice.equalsIgnoreCase("y")){
            System.out.println("Continue? (y/n) ");
            choice = input.nextLine();

        }

        System.out.println("Goodbye");

    }
}

