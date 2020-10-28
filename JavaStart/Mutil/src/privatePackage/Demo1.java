package privatePackage;

import java.util.Date;

public class Demo1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(99);
        person.name = "梵高";
        person.show();

        person.setSex(0);
        System.out.println(person.getSexStr());
        person.setDate(new Date());//匿名对象
        System.out.println(person.getDate());
        System.out.println(person.getDateStr());//需要在网页上输出的日期格式

        Person one = new Person();
        System.out.println(one.getDateStr());
    }
}
