package StringPackage;

/**
 * String字符串常用的三种转换方法
 *
 *
 *
 */
public class Demo5Transfer {

    public static void main(String[] args) {

        //1.返回字符数组
        String str1 = "Hello";
        char[] chars = str1.toCharArray();
        System.out.println(str1.length());//字符串length()  5
        System.out.println(chars.length);//数组是length  集合是size()   5
        //2.返回字节数组
        byte[] bytes = str1.getBytes();
        System.out.println(bytes);        //[B@4554617c
        for (int i = 0; i <bytes.length ; i++) {
            System.out.println(bytes[i]); //输出的是字节的数值72 101 108 102 111
        }
        //3.替换replace（CharSequence oldChar,CharSequence newChar）
        String str2 = "会不会玩啊，你大爷的！";
        String replaceStr = str2.replace("你大爷的", "****");
        System.out.println(replaceStr);//会不会玩啊，****！
    }
}
