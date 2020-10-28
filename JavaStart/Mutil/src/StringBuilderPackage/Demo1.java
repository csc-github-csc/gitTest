package StringBuilderPackage;

public class Demo1 {
    public static void main(String[] args) {
        /*空参*/
        StringBuilder stringBuilder1 = new StringBuilder();
        System.out.println(stringBuilder1);//无数据输出
        /*带参*/
        StringBuilder stringBuilder2 = new StringBuilder("Hello");
        System.out.println(stringBuilder2); //Hello
        /*append() 返回的是当前对象本身*/
        StringBuilder str = new StringBuilder();
        str.append("abc");
        str.append(1);
        str.append(true);
        str.append(8.8);
        str.append("中");
        System.out.println(str);//abc1true8.8中
        /*链式编程：方法返回值是一个对象，可以继续调用方法*/
        System.out.println("abc".toUpperCase().toLowerCase().toUpperCase().toLowerCase());
        str.append("abc").append(111).append(8.88).append("过");
    }
}
