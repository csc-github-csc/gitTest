package StringPackage;

import java.util.ArrayList;

/*
* 定义一个方法，把数组{1,2,3}按照指定格式拼接成一个字符串，格式如下：
*       [word1#word2#word3]
* */
public class Demo7HomeWork1 {
    public static void main(String[] args) {
           int[] array = {1,2,3};
        String s = arrayToString(array);
        System.out.println(s);
    }

    static String arrayToString(int[] array){
        String str = "[";
        for (int i = 0; i <array.length ; i++) {
            if(i==array.length-1){
                str+= "word"+array[i]+"]";
              return str;
            }
            str+= "word"+array[i]+"#";  //str+  直接往后面拼接
         }
        return str;
    }

}
