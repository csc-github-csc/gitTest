package randomPackage;

import java.util.Random;

/**
 * random：随机
 *
 * Random类：产生随机数字
 *
 *
 */
public class Demo {

    public static void main(String[] args) {

        Random r = new Random();
        System.out.println(r.nextInt());

        for(int i=0;i<=10;i++){
            System.out.println(r.nextInt(9));
            //这里面的必须是大于0的数字
        }

    }
}
