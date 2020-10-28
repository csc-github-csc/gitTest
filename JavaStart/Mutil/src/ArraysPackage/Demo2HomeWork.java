package ArraysPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*字符串倒叙*/
public class Demo2HomeWork {
    public static void main(String[] args) {
        System.out.println("请输入：");
        String inputStr = new Scanner(System.in).next();//输入一个字符串
        //先将字符串中的字符升序排序，然后再倒序打印
        char[] chars = inputStr.toCharArray();
        Arrays.sort(chars);//排序

        for (int i = chars.length -1; i >=0 ; i--) {  //可以用chars.forr
            System.out.println(chars[i-1]);
        }
        /*for (int i = chars.length - 1; i >= 0; i--) {
          }
        */


    }
}
