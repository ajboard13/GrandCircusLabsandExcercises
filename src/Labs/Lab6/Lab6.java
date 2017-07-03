package Labs.Lab6;

import Labs.InputValidator;

import java.util.Scanner;
/*
Aaron Board
6/30/2017

this program takes a user entered sentence and converts it to pig latin
 */
public class Lab6 {
    public static void main(String[] args) {
        runPigLatinCalculator();
    }

    private static void runPigLatinCalculator(){
        InputValidator inputValidator = new InputValidator();
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Pig Latin Translator!");
        do{
            System.out.println("Enter a sentence: ");
            String userSentence = input.nextLine();
            PigLatinConverter pigLatinConverter = new PigLatinConverter(userSentence);
            System.out.println(pigLatinConverter.convertToPigLatin());
            inputValidator.checkForUserContinue();
        }while (inputValidator.isUserCont());
        System.out.println("Goodbye!");
    }
}
