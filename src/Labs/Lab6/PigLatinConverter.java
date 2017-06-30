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
    private char[] VOWELS = new char[5];

    public PigLatinConverter(String userLine) {
        this.userLine = userLine;
    }

    public String convertToPigLatin(){
        String result = "a";
        List<String> userWords = getWords();
        for (String word : userWords) {
            if (word.matches("(?i)^[aeiouy].*$")){

            }
        }

        return result;
    }

    private List<String> getWords() {
        List<String> words = new ArrayList<String>();
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
}
