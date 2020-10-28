package SystemPackage;

public class Demo1 {
    public static void main(String[] args) {
        /*public static longcurrentTimeMillis();返回以毫秒为单位的当前时间
        * 用来验证程序的效率
        * */
        long before = System.currentTimeMillis();
        for (int i = 0; i <100 ; i++) {
            System.out.println(i);
        }
        long after = System.currentTimeMillis();
        System.out.println("循环一百次的时间为："+(after-before));//3ms = 3/1000s
    }
}
