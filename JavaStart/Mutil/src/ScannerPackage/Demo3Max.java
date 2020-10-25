package ScannerPackage;

import java.util.Scanner;

public class Demo3Max {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数：");
        int b = sc.nextInt();

        int max = a>b ? a : b;

        System.out.println("请输入第三个数：");
        int c = sc.nextInt();

        max = max>c ?max : c;
        System.out.println("最大数是："+max);


    }
}
