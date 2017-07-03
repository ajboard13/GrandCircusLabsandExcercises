package Labs;


import java.util.Scanner;

public class Lab6Alternative {
    private final static String VOWELS = "aeiou";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Pig Latin Translator!");

        System.out.println("Please enter a word: ");
        String userWord = input.nextLine();
        System.out.println(convertToPigLatin(userWord));

    }

    private static StringBuffer convertToPigLatin(String userWord) {
        StringBuffer result;
        if (userWord.matches("(?i)^[aeiou].*$")){
            result = convertWordStartingWithVowel(userWord);
        }else {
            result = convertWordStartingWithConsonant(userWord);
        }
        return result;
    }

    private static StringBuffer convertWordStartingWithConsonant(String userWord) {
        StringBuffer result = new StringBuffer(userWord);
        int firstVowel = indexOfFirstVowel(userWord);
        if (firstVowel != -1) {
            result.append(result.substring(0, firstVowel)).append("ay");
            result.delete(0,firstVowel);
        }
        return result;
    }

    private static int indexOfFirstVowel(String userWord) {
        for (int index = 0; index < userWord.length(); index++)
        {
            if (VOWELS.contains(String.valueOf(userWord.toLowerCase().charAt(index))))
            {
                return index;
            }
        }
        // handle cases where a vowel is not found
        return -1;
    }

    private static StringBuffer convertWordStartingWithVowel(String userWord) {
        StringBuffer result = new StringBuffer(userWord);
        result.append("say");
        return result;
    }


}
