package CalendarPackage;

import java.util.Calendar;

public class Demo2 {
    public static void main(String[] args) {
        /*Calender的常用方法*/
        /*getInstance()获取Calender对象*/
        Calendar calendar = Calendar.getInstance();
        /*获取年月日*/
        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);//2020
        /*设置年月日*/
        calendar.set(Calendar.YEAR,2000);
        System.out.println(calendar.get(Calendar.YEAR));//2000
        /*把指定的字段增加/减少指定的值
        * 正数：增加   负数：减少
        * */
        calendar.add(Calendar.YEAR,20);
        System.out.println(calendar.get(Calendar.YEAR));//2020(2000+20)因为先前设置了
        calendar.add(Calendar.YEAR,-1);
        System.out.println(calendar.get(Calendar.YEAR));//2019
        /*把日历转换为日期*/
        System.out.println(calendar.getTime());//Mon Oct 28 20:52:19 CST 2019


    }
}
