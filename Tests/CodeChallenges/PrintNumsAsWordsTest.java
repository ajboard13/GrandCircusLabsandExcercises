package CodeChallenges;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 7/28/2017.
 */
public class PrintNumsAsWordsTest {
        @Test
        public void Test1() {
            String expected = "one";
            String actual = PrintNumsAsWords.answer(1);
            assertEquals(expected, actual);
        }
        @Test
        public void Test2() {
            String expected = "two";
            String actual = PrintNumsAsWords.answer(2);
            assertEquals(expected, actual);
        }
        @Test
        public void Test3() {
            String expected = "nine";
            String actual = PrintNumsAsWords.answer(9);
            assertEquals(expected, actual);
        }
        @Test
        public void Test4() {
            String expected = "ten";
            String actual = PrintNumsAsWords.answer(10);
            assertEquals(expected, actual);
        }
        @Test
        public void Test5() {
            String expected = "twenty";
            String actual = PrintNumsAsWords.answer(20);
            assertEquals(expected, actual);
        }
        @Test
        public void Test6() {
            String expected = "thirteen";
            String actual = PrintNumsAsWords.answer(13);
            assertEquals(expected, actual);
        }
        @Test
        public void Test7() {
            String expected = "fifteen";
            String actual = PrintNumsAsWords.answer(15);
            assertEquals(expected, actual);
        }
        @Test
        public void Test21() {
            String expected = "twentyone";
            String actual = PrintNumsAsWords.answer(21);
            assertEquals(expected, actual);
        }

}