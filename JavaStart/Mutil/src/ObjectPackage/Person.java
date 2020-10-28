package ObjectPackage;

import java.util.Objects;

public class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*我想比较name和age两个属性是否相等，所以重写equals方法
    *
    * 其中的注意事项是：这里运用了多态的写法，即：
    *       Object obj = new Person("迪丽热巴",18);
    * 要用自己重写的方法，那么就要用到向下转型。
    * Person p = (Person)obj;
    *
    * */
    /*先自己写*/
   /* @Override
    public boolean equals(Object obj){
        if(obj==this)
            return true; //obj是对象本身，直接返回true，提高程序效率
        if(obj==null)
            return false; //obj是null，直接返回false，提高程序效率
        if(obj instanceof Person){
            Person p = (Person)obj;
            return p.age==this.age&&p.name==this.name;
        }
        return false;
    }*/

    /*alt+insert自动生成*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
