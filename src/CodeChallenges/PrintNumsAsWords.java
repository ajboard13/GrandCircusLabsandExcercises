package CodeChallenges;

/**
 * Created by user on 7/28/2017.
 */
public class PrintNumsAsWords {
    static boolean isTeen = false;

    public static String answer(int num) {
        int temp = num;
        String result = "";
        for (int i = 0; i < String.valueOf(num).length(); i++) {
            result += findNum(temp);
            if (String.valueOf(num).length() == 1 && !isTeen) {
                result += findOnes(temp);
            } else {
                temp = temp % (int) Math.pow(10, (int) Math.log10(temp));
            }
        }
        return result;
    }

    private static int takeOffFirstNum(int num) {
        String temp = String.valueOf(num);
        temp = temp.substring(1);
        int revisedInt = Integer.parseInt(temp);
        return revisedInt;
    }

    private static String findNum(int num) {
        if (String.valueOf(num).length() == 1) {
            return findOnes(num);
        } else if (String.valueOf(num).length() == 2) {
            if (num < 20 && num > 10) {
                return findTeens(num);
            } else {
                return findTens(num);
            }
        } else {
            return "";
        }
    }

    private static String findTeens(int num) {
        String[] teens = {"eleven", "twelve", "thirteen", "fourteen",
                "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        isTeen = true;
        return teens[(num % 10) - 1];
    }

    private static String findTens(int num) {
        String[] tens = {"ten", "twenty", "thirty", "forty", "fifty",
                "sixty", "seventy", "eighty", "ninety"};
        return tens[(num / 10) - 1];
    }

    private static String findOnes(int num) {
        String[] ones = {"one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"};
        return ones[num - 1];
    }

}
