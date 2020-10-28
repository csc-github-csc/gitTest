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
       /* while (finalNum!=printNum){
            result(finalNum,printNum);
            printNum = sc.nextInt();
        }

        System.out.println("恭喜你，猜对了！最终数字是："+finalNum);
*/
       /*给它加一个次数限制*/

       for (int i = 0; i <2 ; i++) {
           if(finalNum!=printNum){
               result(finalNum,printNum);
               printNum = sc.nextInt();
           }else {
               System.out.println("游戏结束，你赢了，数字是："+finalNum);
               System.out.println("你一共猜了"+i+"次");
           }
       }

       System.out.println("游戏结束，你输了，最终数字是："+finalNum);






    }

    static void result(int finalNum,int printNum){
        if(printNum>finalNum){
            System.out.println("猜大了，再猜");
            System.out.println("请输入你猜的数字(0~99)：");
        }else if(printNum<finalNum){
            System.out.println("猜小了，再猜");
            System.out.println("请输入你猜的数字(0~99)：");
        }
    }

}
