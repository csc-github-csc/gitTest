package ArrayListPackage;

import java.util.ArrayList;

/**
 * ArrayList集合当中常用的四种方法（背下来）
 * public boolean add(E e);
 * public E get(int index);
 * public E remove(int index);
 * public int size();
 */
public class ArrayListMethods {


    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("小A");
        list.add("小B");
        list.add("小C");

        String str1 = list.get(0);
        String str2 = list.get(1);
        String str3 = list.get(2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);


        int listSize1 = list.size();
        System.out.println(listSize1);
        System.out.println(list);
        String removeStr = list.remove(0);
        System.out.println(removeStr);
        System.out.println(list);
        int listSize2 = list.size();
        System.out.println(listSize2);

        //遍历 集合 的两种方法

        for(String listStr : list){
            System.out.println(listStr);
        }

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));  //集合元素的获取要用get(index)方法
        }

        //平常的 数组 的遍历
        /*
        * for(int i=0;i<list.length;i++){
        *       sout(list[i]);   //数组元素的获取直接用下标
        * }
        * */



    }
}
