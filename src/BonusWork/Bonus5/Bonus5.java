package BonusWork.Bonus5;

import Labs.InputValidator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bonus5 {
    private static ArrayList<Student> studentList;
    private static Scanner input = new Scanner(System.in);
    private static InputValidator inputValidator = new InputValidator();
    private static int listSize;
    private static int startingIndex;
    public static void main(String[] args) {
        System.out.println("Welcome to the Student Scores Application!\n");
        runStudentScoresApp();
        System.out.println("Goodbye!");
    }

    private static void runStudentScoresApp(){
        do {
            findStartingIndex();
            populatePersonList();
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
        }else {
            for (Student student: studentList) {
                student.setSortByScore(false);
            }
        }
    }

    private static void askForNumberOfStudents(){
        System.out.println("Enter number of students: ");
        listSize = inputValidator.getValidPositiveInt();
        studentList = new ArrayList<>(listSize);
    }

    private static void askHowManyStudentsToAdd(){
        System.out.println("How many students do you wish to add: ");
        listSize += inputValidator.getValidPositiveInt();
    }

    private static void findStartingIndex(){
        if(listSize != 0){
            if(checkIfUserWantsToKeepList()) {
                if (checkIfUserWantsToAppendToList()) {
                    startingIndex = studentList.size();
                    askHowManyStudentsToAdd();
                }
                startingIndex = studentList.size();
            }else{
                askForNumberOfStudents();
            }
        }else {
            askForNumberOfStudents();
        }
    }

    private static void populatePersonList(){
        for (int i = startingIndex; i < listSize; i++) {
            System.out.printf("\nStudent %d last name: ", (i + 1));
            String lastName = inputValidator.getNonEmptyString("Please enter a valid last name: ");
            System.out.printf("Student %d first name: ", (i + 1));
            String firstName = inputValidator.getNonEmptyString("please enter a valid first name: ");
            System.out.printf("Student %d score: ", (i + 1));
            int score = inputValidator.getValidIntBetweenTwoNumbers(0, 100);
            studentList.add(new Student(firstName, lastName, score));
        }
    }

    private static boolean checkIfUserWantsToAppendToList() {
        System.out.println("Would you like to add more students to the original list? (y/n) ");
        return inputValidator.checkForValidChoice(input.nextLine(),"y","n");
    }

    private static void printStudentResults(){
        System.out.println();
        for (Student student: studentList) {
            System.out.println(student.toString());
        }
    }

    private static boolean checkIfUserWantsToKeepList(){
        System.out.println("Would you like to keep the same list? (y/n)");
        return inputValidator.checkForValidChoice(input.nextLine(), "y", "n");
    }

    static ArrayList<Student> getStudentList() {
        return studentList;
    }
}
