package packPackage;

public class Demo3 {
    public static void main(String[] args) {
        /*基本数据类型--》字符串类型  三种方法*/
        /* 直接+“”  （int） 100 + "" ---> (String)"100"   */
        int num = 100;
        String str = num +"";
        System.out.println(str+200);//100200
        /*包装类的toString()方法*/
        System.out.println(new Integer(100).toString() + 200);//100200
        /*String类的静态方法valueOf(参数)*/
        System.out.println(String.valueOf(num) + 200);//100200

        /*字符串类型--》基本数据类型*/
        /*使用包装类的静态方法parseXxx(“数值类型的字符串”);*/
        System.out.println(Integer.parseInt("100")+200);//300

    }
}
