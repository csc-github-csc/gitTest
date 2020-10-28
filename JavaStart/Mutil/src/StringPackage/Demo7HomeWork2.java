package StringPackage;

import java.util.Scanner;

/*

*   键盘输入一个字符串，并且统计其中各种字符出现的次数。

种类有大写字母，小写字母，数字，其他。

**/
public class Demo7HomeWork2 {
    public static void main(String[] args) {
        System.out.println("键盘输入的字符串是：");
        Scanner sc = new Scanner(System.in);
        String scStr = sc.next();
        //byte[] bytes = scStr.getBytes();  //用byte你得知道ASC码值
        int countUpper = 0;//大写字母
        int countLower = 0;//小写字母
        int countNumber = 0;//数字
        int countOther = 0;//其它种类

        char[] chars = scStr.toCharArray();

        for (int i = 0; i <chars.length ; i++) {
            char ch = chars[i];//当前单个字符
            if('A'<=ch && ch<='Z'){
                countUpper++;
            }else if('a'<ch && ch<='z'){
                countLower++;
            }else if('0'<ch && ch<='9'){
                countNumber++;
            }else{
                countOther++;
            }
        }
        System.out.println("大写字母有："+countUpper);
        System.out.println("小写字母有："+countLower);
        System.out.println("数字有："+countNumber);
        System.out.println("其他有："+countOther);

    }
}
