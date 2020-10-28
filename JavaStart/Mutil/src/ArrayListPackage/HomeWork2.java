package ArrayListPackage;

import java.util.ArrayList;
import java.util.Random;
/**
 * 定义以指定格式打印集合的方法（ArrayList类型作为参数），使用{}括起集合
 *使用@分隔每个元素，打印输出样式举例子：{元素1@元素2@元素3}
 *
 * 正常集合的打印是这样的：
 * []空集合
 * [元素1，元素2，元素3]
 *
 * */

public class HomeWork2 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        printMethod(list,100); //参数一：集合，参数二：随机数上限

    }


    static void printMethod(ArrayList arrayList,int bound){
        Random random = new Random();
        for(int i=0;i<5;i++){
            arrayList.add(random.nextInt(bound));
        }
        System.out.print("{");
        for (int j = 0; j <arrayList.size() ; j++) {
            if(j==arrayList.size()-1){
                System.out.print(arrayList.get(j)+"}");
                return;
            }
            System.out.print(arrayList.get(j)+"@");
        }

    }
}
