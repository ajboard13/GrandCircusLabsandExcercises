package CodeChallenges;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 7/28/2017.
 */
public class PrintNumsAsWordsTest {
        PrintNumsAsWords pn = new PrintNumsAsWords();

        @Test
        public void Test1() {
            String expected = "one";
            String actual = pn.answer(1);
            assertEquals(expected, actual);
        }
        @Test
        public void Test2() {
            String expected = "two";
            String actual = pn.answer(2);
            assertEquals(expected, actual);
        }
        @Test
        public void Test3() {
            String expected = "nine";
            String actual = pn.answer(9);
            assertEquals(expected, actual);
        }
        @Test
        public void Test4() {
            String expected = "ten";
            String actual = pn.answer(10);
            assertEquals(expected, actual);
        }
        @Test
        public void Test5() {
            String expected = "twenty";
            String actual = pn.answer(20);
            assertEquals(expected, actual);
        }
        @Test
        public void Test6() {
            String expected = "thirteen";
            String actual = pn.answer(13);
            assertEquals(expected, actual);
        }
        @Test
        public void Test7() {
            String expected = "fifteen";
            String actual = pn.answer(15);
            assertEquals(expected, actual);
        }
        @Test
        public void Test21() {
            String expected = "twenty-one";
            String actual = pn.answer(21);
            assertEquals(expected, actual);
        }

    @Test
    public void Test97() {
        String expected = "ninety-seven";
        String actual = pn.answer(97);
        assertEquals(expected, actual);
    }
    @Test
    public void Test122() {
        String expected = "one hundred twenty-two";
        String actual = pn.answer(122);
        assertEquals(expected, actual);
    }

    @Test
    public void Test974() {
        String expected = "nine hundred seventy-four";
        String actual = pn.answer(974);
        assertEquals(expected, actual);
    }

    @Test
    public void Test1325() {
        String expected = "one thousand, three hundred twenty-five";
        String actual = pn.answer(1325);
        assertEquals(expected, actual);
    }

    @Test
    public void Test206489() {
        String expected = "two hundred six thousand, four hundred eighty-nine";
        String actual = pn.answer(206489);
        assertEquals(expected, actual);
    }

    @Test
    public void Test45678() {
        String expected = "forty-five thousand, six hundred seventy-eight";
        String actual = pn.answer(45678);
        assertEquals(expected, actual);
    }

    @Test
    public void Test206() {
        String expected = "two hundred six";
        String actual = pn.answer(206);
        assertEquals(expected, actual);
    }

    @Test
    public void Test45678490() {
        String expected = "forty-five million, six hundred seventy-eight thousand, four hundred ninety";
        String actual = pn.answer(45678490);
        assertEquals(expected, actual);
    }
}