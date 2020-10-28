package StringPackage;

public class Demo1 {
    public static void main(String[] args) {
        //String字符串的空参构造
        String str1 = new String();
        System.out.println(str1);
        //根据字符数组创建字符串
        char[] chars = {'A','B','C'};
        String str2 = new String(chars);
        System.out.println(str2);
        //根据字节数组创建字符串  byte括号里面是数值（不能超过范围）
        byte[] bytes = {97,98,99};  /** 这里要格外的注意 **/
        String str3 = new String(bytes);
        System.out.println(str3);
        //直接创建
        String str4 = "hello";
        System.out.println(str4);

    }
}
