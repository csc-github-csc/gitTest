package ArraysPackage;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        int[] num = {1,2,3,45,6,2,77,8};
        String toString = Arrays.toString(num);//将数组转换成字符串
        System.out.println(toString);//[1, 2, 3, 45, 6, 2, 77, 8]
        Arrays.sort(num);//对数组当中的数字进行升序排序（从小到大）
        String toString1 = Arrays.toString(num);
        System.out.println(toString1);//[1, 2, 2, 3, 6, 8, 45, 77]
        String[] str = {"bb","a","cc"};
        Arrays.sort(str);//能进行排序的参数类型有很多，String[]也可以
        String s = Arrays.toString(str);
        System.out.println(s);//[a, bb, cc]

    }
}
