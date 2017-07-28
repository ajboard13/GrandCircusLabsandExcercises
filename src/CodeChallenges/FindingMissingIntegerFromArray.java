package CodeChallenges;

import java.util.ArrayList;

/**
 * Created by user on 7/28/2017.
 */
public class FindingMissingIntegerFromArray {
    public static void main(String[] args) {

    }
    public ArrayList<Integer> findMissingInts(int[] nums){
        ArrayList<Integer> missingNums = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i != 0) {
                if (nums[i] - 1 != nums[i - 1]) {
                    missingNums.add(nums[i]-1);
                }
            }
        }

        return missingNums;
    }
    private static ArrayList<Integer> createComparisonArray(int[] nums){
        int maxValue = nums[nums.length-1];
        ArrayList<Integer> compareArray = new ArrayList<>();
        for (int i = 1; i < maxValue; i++) {
            compareArray.add(i);
        }
        return compareArray;
    }
}
