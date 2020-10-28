package ArrayListPackage;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 *用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合当中
 *要求使用自定义的方法来实现筛选。
 *
 * 附加题：如果我要小集合实现从小到大或者从大到小排序,,这好像要涉及算法了，先留空吧
 *
 */

public class HomeWork3 {

    public static void main(String[] args) {
        ArrayList<Integer> listBig = new ArrayList<>();
        ArrayList<Integer> listSmall = new ArrayList<>();
        Random random = new Random();
        int temp = 0;
        for (int i = 0; i <20 ; i++) {
            listBig.add(random.nextInt(100));
        }
        for (int i = 0; i <listBig.size() ; i++) {
            if(listBig.get(i)%2==0){
                listSmall.add(listBig.get(i));
            }
        }

        System.out.println(listBig);
        System.out.println(listSmall);





    }
}
