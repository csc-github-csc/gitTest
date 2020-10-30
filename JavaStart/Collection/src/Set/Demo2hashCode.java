package Set;

public class Demo2hashCode {
    public static void main(String[] args) {
        /*Object类的hashCode()*/
        Person p1 = new Person();
        Person p2 = new Person();
        System.out.println(p1.hashCode());//1163157884
        System.out.println(p2.hashCode());//1956725890
        /*Object类的toString（）*/
        /*return getClass().getName() + "@" + Integer.toHexString(hashCode());*/
        /*@后面是hashCode十进制整数对于的十六进制*/
        System.out.println(p1.toString());//Set.Person@4554617c
        System.out.println(p2.toString());//Set.Person@74a14482
        /*Person重写hashCode()方法*/
        System.out.println(p1.hashCode());//1
        System.out.println(p2.hashCode());//1
        /*String字符串的hashCode方法也是重写了*/
        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println(str1.hashCode());//96354
        System.out.println(str2.hashCode());//96354


    }
}
