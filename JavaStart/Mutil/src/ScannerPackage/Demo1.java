package ScannerPackage;

import java.util.Scanner;

public class Demo1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("键盘输入的数字是："+i);
        //数字，字符串...是绿色，表示的是键盘输入的
        //数字，字符串...是黑色，表示程序输出的


        String str = sc.next();
        System.out.println("键盘输入的字符串是："+str);

    }
}
