package CodeChallenges;

/*
Aaron Board
 */
public class PrintNumsAsWords {
    private static String[] lowNums = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static final String[] tens = {
            "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    private static final String[] prefixes = {
            "thousand", "million", "billion"};

    public static String answer(int num) {
        if (num <= 999) {
            return convertLargeNum(num);
        }
        String s = null;
        int t = 0;
        while (num > 0) {
            if (num % 1000 != 0) {
                String s2 = convertLargeNum(num % 1000);
                if (t > 0) {
                    s2 = s2 + " " + prefixes[t - 1];
                }
                if (s == null) {
                    s = s2;
                } else {
                    s = s2 + ", " + s;
                }
            }
            num /= 1000;
            t++;
        }
        return s;
    }

    private static String convertLargeNum(int num) {
        String s1 = lowNums[num / 100] + " hundred";
        String s2 = convertLowNums(num % 100);
        if (num <= 99) {
            return s2;
        } else if (num % 100 == 0) {
            return s1;
        } else {
            return s1 + " " + s2;
        }
    }

    private static String convertLowNums(int num) {
        if (num < 20) {
            return lowNums[num];
        }
        String s = tens[num / 10 - 2];
        if (num % 10 == 0) {
            return s;
        }
        return s + "-" + lowNums[num % 10];
    }

}
