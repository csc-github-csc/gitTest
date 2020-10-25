package randomPackage;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * 用代码模拟猜数字的小游戏
 *
 */
public class Demo2 {
   private static Scanner sc = new Scanner(System.in);

   public static void main(String[] args) {

        Random r = new Random();
        final int finalNum = r.nextInt(100);

        System.out.println("请输入你猜的数字(0~99)：");
        int printNum = sc.nextInt();
        while (finalNum!=printNum){
            result(finalNum,printNum);
        }


        System.out.println("恭喜你，猜对了！最终数字是："+finalNum);

    }

    static void result(int finalNum,int printNum){
        if(printNum>finalNum){
            System.out.println("猜大了，再猜");
            System.out.println("请输入你猜的数字(0~99)：");
            printNum = sc.nextInt();
        }else if(printNum<finalNum){
            System.out.println("猜小了，再猜");
            System.out.println("请输入你猜的数字(0~99)：");
            printNum = sc.nextInt();
        }
    }

}
