package CodeChallenges;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by user on 7/28/2017.
 */
public class FindingMissingIntegerFromArray {
    public static void main(String[] args) {

    }

    public ArrayList<Integer> findMissingInts(int[] nums) {
        ArrayList<Integer> missingNums = new ArrayList<>();
        int numOfMissingNums = Arrays.stream(nums).max().getAsInt() - nums.length;
        int i = 0;
        while (missingNums.size() < numOfMissingNums) {
            if (getComparingInt(missingNums, i) != nums[i]) {
                missingNums.add(getComparingInt(missingNums, i));
                i++;
            } else {
                i++;
            }
            if (missingNums.size() > 1) {
                if (missingNums.get(missingNums.size() - 2) == missingNums.get(missingNums.size() - 1) - 2) {
                    missingNums.set(missingNums.size() - 1, missingNums.get(missingNums.size() - 1) - 1);
                    i--;
                }
            }
        }
        return missingNums;
    }

    private int getComparingInt(ArrayList<Integer> missingNums, int i) {
        return i + 1 + missingNums.size();

    }
}
