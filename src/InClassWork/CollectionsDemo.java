package InClassWork;

import java.util.ArrayList;

/*
Aaron Board
07/06/2017
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayListDemo();
    }

    private static void ArrayListDemo(){
        ArrayList<String> strArrList = new ArrayList<>(5);

        strArrList.add("Mark");
        strArrList.add("Eric");
        strArrList.add("Vernon");
        System.out.println(strArrList);

        for (int i = 0; i < strArrList.size(); i++) {
            System.out.println(strArrList.get(i));
        }

        for (String aStrArrList : strArrList) {
            System.out.println(aStrArrList);
        }
    }
}
