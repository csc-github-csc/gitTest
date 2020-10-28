package StringBuilderPackage;

public class Demo2 {
    public static void main(String[] args) {
        /*String-->StringBuilder利用StringBuilder的带参构造*/
        StringBuilder str1 = new StringBuilder("hello");
        System.out.println(str1);//hello  (String-->StringBuilder)

        /*StringBuilder-->String利用StringBuilder中的toString（）*/
        str1.append(" world!");
        String str2 = str1.toString();
        System.out.println(str2);//hello world! (StringBuilder-->String)
    }
}
