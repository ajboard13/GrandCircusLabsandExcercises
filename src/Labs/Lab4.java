package Labs;

/*
Aaron Board
6/29/2017

This program will give you a factorial for any number between 1 and 20
*/
public class Lab4 {
    private static InputValidation inputValidation = new InputValidation();

    public static void main(String[] args) {
        long factorialResult;
        int minNum = 0;
        int maxNum = 20;
        System.out.println("Welcome to the Factorial Calculator!\n");
        do {
            inputValidation.getValidIntBetweenTwoNumbers(minNum, maxNum);
            int userInt = inputValidation.getUserInt();
            factorialResult = calculateFactorial(userInt);
            System.out.println("The factorial of " + userInt + " is " + factorialResult);
            inputValidation.checkForUserContinue();
        } while (inputValidation.isUserCont());
        System.out.println("Goodbye!");
    }

    private static long calculateFactorial(int n) {
        long result;
        if(n==1)
            return 1;
        result = calculateFactorial(n-1) * n;
        return result;
    }


}
