package Set;

import java.util.HashSet;

public class Demo4 {
    /*HashSet存储自定义类型的数据，必须保证重写了hashCode()
    * 和equals（），以保证存储到集合中元素的唯一。
    *
    * 本题要求姓名和年龄一样，即为同一元素。
    * */
    public static void main(String[] args) {
        Person p1 = new Person("A", 10);
        Person p2 = new Person("A", 10);
        Person p3 = new Person("A", 11);
        HashSet<Person> hs = new HashSet<>();
        hs.add(p1);hs.add(p2);hs.add(p3);
        /*未重写数据类型的hashCode和equals方法*/
        System.out.println(hs);//[Person{name='A', age=10}, Person{name='A', age=10}, Person{name='A', age=11}]

        /*重写后*/
        System.out.println(hs);//[Person{name='A', age=10}, Person{name='A', age=11}]
    }
}
