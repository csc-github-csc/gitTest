package ArrayListPackage;

import java.util.ArrayList;

public class ArrayListBasic {


    public static void main(String[] args) {

        ArrayList<Integer> listInt = new ArrayList<>();
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);
        System.out.println(listInt.size());
        System.out.println(listInt.get(2));
        System.out.println(listInt.remove(0));
        System.out.println(listInt.size());

    }
}
