package DatePackage;

import java.util.Date;

public class Demo2 {
    public static void main(String[] args) {
        /*无参构造：Date()获取当前系统的日期和时间*/
        Date date = new Date();
        System.out.println(date);//Wed Oct 28 19:34:38 CST 2020（CST中国标准时间）
        /*打印的不是地址是日期，说明Date类重写了toString()方法*/

        /*带参构造：Date(Long date):Long类型，传递毫秒值，把毫秒值转换为Date日期*/
        System.out.println(new Date(0));//Thu Jan 01 08:00:00 CST 1970

        /*常用的成员方法：long getTime()把日期转换为毫秒值*/
        /*返回的就是原点到现在经历的毫秒值*/
        System.out.println(new Date().getTime());//1603885223851
    }
}
