package InClassWork;

public class ForLoopEx {
    public static void main(String[] args) {
        forLoop();
        forEachLoopEx();
        forEachLoopEx2();
    }

    public static String forLoop() {
        String str = "";
        for (int i = 0; i < 5; i++) {
            str += i + " ";
        }
        System.out.println(str);
        return str;
    }

    public static String forEachLoopEx() {
        int[] numbers = {10, 20, 30, 40, 50};
        String str = "";
        for (int x : numbers) {
            str += x + ",";

        }
        System.out.println(str);
        return str;
    }

    public static String forEachLoopEx2() {
        System.out.print("\n");
        String str = "";
        String[] names = {"James", "Larry", "Tom", "Lacy"};
        for (String name : names) {
            str += name + ",";
        }
        System.out.println(str);
        return str;
    }
}
