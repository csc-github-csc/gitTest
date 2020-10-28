package StringPackage;

public class Demo4Get {
    public static void main(String[] args) {

        int length = "abocbsocsc".length();
        System.out.println(length);

        //拼接字符串         我们学过字符串的内容不可改变
        String str1 = "Hello";
        String str2 = "World!";
        String str3 = str1.concat(str2);
        System.out.println(str3);//str3是新的字符串，str1和str2都是不会改变的，，字符串不变
                                 //如果说字符串变了，那就一定是创建了一个新的字符串

        //获取指定索引位置的当个字符
        char c = str1.charAt(0);
        System.out.println(c);

        int i1 = str1.indexOf("llo");
        System.out.println(i1);  //出现的第一次索引  2
        int i2 = str1.indexOf("abc");
        System.out.println(i2);//因为没有，所以返回-1



    }
}
