package CodeChallenges;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by user on 7/28/2017.
 */
public class FindingMissingIntegerFromArrayTest {
    @Test
    public void findMissingInts() throws Exception {
        FindingMissingIntegerFromArray fm = new FindingMissingIntegerFromArray();
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(5);
        ArrayList<Integer> actual = fm.findMissingInts(new int[]{1, 3, 4, 6, 7, 8, 9, 10});
        assertArrayEquals(expected.toArray(), actual.toArray());
    }
    @Test
    public void findMissingInts2() throws Exception {
        FindingMissingIntegerFromArray fm = new FindingMissingIntegerFromArray();
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(3);
        expected.add(7);
        ArrayList<Integer> actual = fm.findMissingInts(new int[]{1, 2, 4, 5, 6, 8, 9, 10});
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    public void findMissingInts3() throws Exception {
        FindingMissingIntegerFromArray fm = new FindingMissingIntegerFromArray();
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(4);
        expected.add(5);
        ArrayList<Integer> actual = fm.findMissingInts(new int[]{1, 2, 3, 6, 7, 8, 9, 10});
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

}