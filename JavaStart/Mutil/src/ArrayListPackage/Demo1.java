package ArrayListPackage;

import privatePackage.Person;

/*
* 定义一个数组，用来存储3个Person对象
* */
public class Demo1 {
    public static void main(String[] args) {
        Person[] person = new Person[3];
/*
        Person one = new Person();
               one.name = "迪丽热巴";  //成员变量在不同包中只有public才允许访问
        Person two  = new Person();
               two.name = "古力娜扎";
        Person three = new Person();
               three.name = "马尔扎哈";


        //把三个对象放进数组当中  对象数组
        person[0] = one;  //都知道对象名里存放的是地址值，把这些地址值赋值给数组
        person[1] = two;    //那么数组里面也是存储的是地址值
        person[2] = three;
*/
    //既然对象只要用一次，那么使用匿名对象好了,成员变量的赋值使用构造方法了
        person[0] = new Person();
        person[1] = new Person();
        person[2] = new Person();
        System.out.println(person[0]);//地址值
        System.out.println(person[1]);//地址值
        System.out.println(person[2]);//地址值










    }
}
