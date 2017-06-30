package Labs.Lab6;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 6/30/2017.
 */
public class PigLatinConverter {
    private String userLine;
    final static String VOWELS = "aeiou";

    public PigLatinConverter(String userLine) {
        this.userLine = userLine;
    }

    public StringBuffer convertToPigLatin(){
        StringBuffer result = new StringBuffer();
        List<String> userWords = getWords();
        for (String word : userWords) {
            if (word.matches("(?i)^[aeiouy].*$")){
                result.append(convertWordStartingWithVowel(word) + " ");
            } else {
                result.append(convertWordStartingWithConsonant(word) + " ");
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
            result.append(result.substring(0, firstVowel) + "ay");
            result.delete(0,firstVowel);
        }
        return result;
    }

    public static int indexOfFirstVowel(String word){
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
}
