package InClassWork;

/**
 * Created by user on 6/28/2017.
 */
public class WhileLoopEx2 {
    public static void main(String[] args) {
        System.out.println("hello world");

        int i = 1;

        while (i <= 4){
            System.out.println(i);
            i++;
        }
        infiniteLoop();
    }

    public static void infiniteLoop(){
        while (true){

            int randomNumber = (int) (Math.random() * 11);
            System.out.println(randomNumber);

            if (randomNumber == 7){
                System.out.println("correct value found!");
                break;
            }
        }

        for (int i = 0; i < 5; i++) {
            int randomNum = (int) (Math.random() * 11);
            if (randomNum > 7){
                System.out.println("invalid number, continue the loop");
                continue;
            }
            System.out.println(randomNum);
        }
    }
}
