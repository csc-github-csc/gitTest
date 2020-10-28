package DatePackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo3 {
    /*DateFormat类中的format方法  ：也就是格式化（日期--》文本）   */
    private static String pattern = "yyyy年MM月dd日 HH时mm分ss秒";
    public static String getStrTime(Date date){
        SimpleDateFormat sf = new SimpleDateFormat(pattern);
        return sf.format(date);
    }
    /*DateFormat类中的parse方法   :也就是解析（文本--》日期）*/
    public static Date getDateTime(String source) throws ParseException {
        SimpleDateFormat sf = new SimpleDateFormat(pattern);
        return sf.parse(source);
    }

    public static void main(String[] args) throws ParseException {
        System.out.println(getStrTime(new Date()));//2020年10月28日 20时08分41秒
        String source = "2088年11月20日 10时18分10秒";
        System.out.println(getDateTime(source));//Sat Nov 20 10:18:10 CST 2088
    }

}
