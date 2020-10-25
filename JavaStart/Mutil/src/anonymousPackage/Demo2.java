package anonymousPackage;

import java.util.Scanner;

public class Demo2 {

    //任何数据类型都可以作为方法的返回值和参数


    //作为返回值
    static Scanner method1(){
        return new Scanner(System.in);
    }

    //作为参数
    static void method2(Scanner scanner){
        int num = scanner.nextInt();
        System.out.println("输入的数字是："+num);
    }


    public static void main(String[] args) {
        Scanner sc1 = method1();
        System.out.println("输入的数字是："+sc1.nextInt());


        method2(new Scanner(System.in));

    }



}
