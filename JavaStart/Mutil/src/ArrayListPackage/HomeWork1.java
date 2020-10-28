package ArrayListPackage;

import java.util.ArrayList;
import java.util.Random;

public class HomeWork1 {

    public static void main(String[] args) {
        ArrayList<Integer> listInteger = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i <6 ; i++) {
            listInteger.add(random.nextInt(32)+1);
        }
        for (int i = 0; i <listInteger.size() ; i++) {
            System.out.println(listInteger.get(i));
        }



    }
}
