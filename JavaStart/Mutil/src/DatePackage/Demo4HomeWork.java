package DatePackage;

import java.util.Date;

/**
 * 计算一个人已经出生了
 *
 *
 */
public class Demo4HomeWork {
    public static void main(String[] args) {
            //假设这个人的生日是1998-08-13  现在是2020-10-28
        Date dateNow = new Date();
        /*成员方法**/
        long timeNow = dateNow.getTime();//现在距离原点

        Date dateBirth = new Date();



        /*带参构造*/
        long timeOld = 0;
        Date date2 = new Date(timeOld);


    }
}
