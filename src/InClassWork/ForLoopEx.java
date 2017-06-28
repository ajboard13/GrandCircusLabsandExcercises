package InClassWork;

public class ForLoopEx {
    public static void main(String[] args) {
        forLoop();
    }

    public static String forLoop(){
        String str = "";
        for (int i = 0; i < 5; i++){
            str += i + " ";
        }
        System.out.println(str);
        return str;
    }
}
