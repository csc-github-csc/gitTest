package MathPackage;
/*Math类*/
public class Demo1 {
    public static void main(String[] args) {
        //取绝对值
        double d1 = 3.14;
        double d2 = -3.14;
        System.out.println(Math.abs(d1));//3.14
        System.out.println(Math.abs(d1));//3.14
        //向上取整
        double d3 = 3.9;
        double d4 = 3.0;
        System.out.println(Math.ceil(d3));//4.0
        System.out.println(Math.ceil(d4));//3.0
        //向下取整
        System.out.println(Math.floor(d3));//3.0
        System.out.println(Math.floor(d4));//3.0
        //四舍五入
        System.out.println(Math.round(d3));//4
        System.out.println(Math.round(d4));//3



    }
}
