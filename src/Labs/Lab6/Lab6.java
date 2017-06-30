package Labs.Lab6;

import Labs.InputValidator;

import java.util.Scanner;

/**
 * Created by user on 6/30/2017.
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
    }
}
