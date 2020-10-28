package privatePackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_StringUtils {/**/
    private static final String pattern = "yyyy-MM-dd";

    public static String getDateStr(Date date){
        SimpleDateFormat sf = new SimpleDateFormat(pattern);
        String dateStr = sf.format(date);
        return dateStr;
    }


    public static Date getDate(String str){
        SimpleDateFormat sf = new SimpleDateFormat(pattern);
        Date date = null; //方法体内的局部变量必须初始化
        try {
            date = sf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

}
