package CalendarPackage;

import java.util.Calendar;

public class Demo1 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance(); //多态
        System.out.println(calendar);//打印的是日历，说明这个类也重写了toString方法
    }
}
