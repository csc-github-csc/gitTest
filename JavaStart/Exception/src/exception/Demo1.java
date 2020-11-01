package exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo1 {
    public static void main(String[] args) /*throws ParseException*/ {
        //Exception:编译时期的异常，进行编译（写代码的时候）java程序出现的问题
       /* SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:ss");
        Date parse = null;
        try {
            parse = simpleDateFormat.parse("2020-10-11 12:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(parse);
       */

   /*     //RuntimeException:
        int[] arr = {1,2,3};
        try{
            //可能出现异常的代码
            System.out.println(arr[3]);
        }catch (Exception e){
            System.out.println(e);
        }
*/
        //Error错误
        //int[] arr = new int[1024*1024*1024];//OutOfMemoryError内存溢出错误
        //必须修改代码



        System.out.println("后续代码");

    }
}
