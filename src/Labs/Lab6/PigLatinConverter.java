package Labs.Lab6;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;

/*
Aaron Board
6/30/2017
 */
class PigLatinConverter {
    private String userLine;
    private final static String VOWELS = "aeiou";

    PigLatinConverter(String userLine) {
        this.userLine = userLine;
    }

    StringBuffer convertToPigLatin(){
        StringBuffer result = new StringBuffer();
        List<String> userWords = getWords();
        boolean isContraction;
        for (String word : userWords) {
            if (word.matches("(?i)^[aeiouy].*$")){
                isContraction = checkForContraction(word);
                if (!isContraction) {
                    result.append(convertWordStartingWithVowel(word)).append(" ");
                }else {
                    result.append(word).append(" ");
                }
            } else {
                isContraction = checkForContraction(word);
                if (!isContraction) {
                    result.append(convertWordStartingWithConsonant(word)).append(" ");
                }else {
                    result.append(word).append(" ");
                }
            }
        }

        return result;
    }


    //this method puts the word of the sentence into an array of words.
    private List<String> getWords() {
        List<String> words = new ArrayList<>();
        BreakIterator breakIterator = BreakIterator.getWordInstance();
        breakIterator.setText(userLine);
        int lastIndex = breakIterator.first();
        while (BreakIterator.DONE != lastIndex) {
            int firstIndex = lastIndex;
            lastIndex = breakIterator.next();
            if (lastIndex != BreakIterator.DONE && Character.isLetterOrDigit(userLine.charAt(firstIndex))) {
                words.add(userLine.substring(firstIndex, lastIndex));
            }
        }

        return words;
    }

    private StringBuffer convertWordStartingWithVowel(String word){
        StringBuffer result = new StringBuffer(word);
        result.append("say");
        return result;
    }

    private StringBuffer convertWordStartingWithConsonant(String word) {
        StringBuffer result = new StringBuffer(word);
        int firstVowel = indexOfFirstVowel(word);
        if (firstVowel != -1) {
            result.append(result.substring(0, firstVowel)).append("ay");
            result.delete(0,firstVowel);
        }
        return result;
    }

    private static int indexOfFirstVowel(String word){
        for (int index = 0; index < word.length(); index++)
        {
            if (VOWELS.contains(String.valueOf(word.toLowerCase().charAt(index))))
            {
                return index;
            }
        }
        // handle cases where a vowel is not found
        return -1;
    }

    private static boolean checkForContraction(String word){
        for (int index = 0; index < word.length(); index++)
        {
            if ("'".contains(String.valueOf(word.toLowerCase().charAt(index))))
            {
                return true;
            }
        }
        return false;
    }
}
