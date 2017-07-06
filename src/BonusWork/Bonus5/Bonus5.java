package BonusWork.Bonus5;

import Labs.InputValidator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bonus5 {
    private static ArrayList<Student> studentList;
    private static Scanner input = new Scanner(System.in);
    private static InputValidator inputValidator = new InputValidator();
    public static void main(String[] args) {
        System.out.println("Welcome to the Student Scores Application!\n");
        runStudentScoresApp();
    }

    private static void runStudentScoresApp(){
        do {
            populatePersonList(askForNumberOfStudents());
            boolean sortByScore = checkIfUserWantsListSortedByScore();
            setStudentsToSortByScore(sortByScore);
            Collections.sort(studentList);
            printStudentResults();
            inputValidator.checkForUserContinue("\nWould you like to run another list of students? (y/n)");
        }while (inputValidator.isUserCont());
    }

    private static boolean checkIfUserWantsListSortedByScore() {
        boolean sortByScore;
        System.out.println("\nWould you like to sort the list by score? (y/n)");
        String answer = input.nextLine();
        sortByScore = inputValidator.checkForValidChoice(answer,"y","n");
        return sortByScore;
    }

    private static void setStudentsToSortByScore(boolean sortByScore){
        if (sortByScore){
            for (Student student: studentList) {
                student.setSortByScore(true);
            }
        }
    }

    private static int askForNumberOfStudents(){
        System.out.println("Enter number of students: ");
        int numStudents = inputValidator.getValidPositiveInt();
        studentList = new ArrayList<>(numStudents);
        return numStudents;
    }

    private static void populatePersonList(int numStudents){
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("\nStudent %d last name: ", (i+1));
            String lastName = inputValidator.getNonEmptyString("Please enter a valid last name: ");
            System.out.printf("Student %d first name: ", (i+1));
            String firstName = inputValidator.getNonEmptyString("please enter a valid first name: ");
            System.out.printf("Student %d score: ", (i+1));
            int score = inputValidator.getValidIntBetweenTwoNumbers(0,100);
            studentList.add(new Student(firstName,lastName,score));
        }
    }

    private static void printStudentResults(){
        System.out.println();
        for (Student student: studentList) {
            System.out.println(student.toString());
        }
    }

}
