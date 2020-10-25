package randomPackage;

import java.util.Random;

public class Demo1 {
    /**
     * 根据int变量n的值，来获取随机数字，范围是【1，n】
     *
     *
     */


    public static void main(String[] args) {

        Random r= new Random();

        for(int i=0;i<=20;i++){
            System.out.println(r.nextInt(10)+1);
        }


    }

}
