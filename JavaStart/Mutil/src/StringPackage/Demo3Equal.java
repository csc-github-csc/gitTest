package StringPackage;
/*对于引用类型：
* ==比较的是对象的地址值
* public boolean euqals(Object obj)比较的才是内容，但
* 如果要想结果返回true，不仅要内容一样，且obj一定要是字符串，否则返回false
* */
public class Demo3Equal {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArry = {'H','e','l','l','o'};
        String str3 = new String(charArry);
        System.out.println(str1.equals(str2)); //true
        System.out.println(str1.equals(str3)); //true
        System.out.println(str3.equals("Hello")); //true
        System.out.println("Hello".equals(str1));//true

        String str4 = "hello";
        System.out.println(str1.equals(str4));//flase
        System.out.println(str1.equalsIgnoreCase(str4));//true

    }
}
