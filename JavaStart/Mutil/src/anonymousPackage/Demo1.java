package anonymousPackage;

/**
 * anonymous:匿名
 *
 *
 *
 *
 */
public class Demo1 {

    static class Person{
        String name;
        int age;

        Person(){
            System.out.println("无参构造");
        }
        Person(String name,int age){
            this.name = name;
            this.age = age;
        }

    }

    public static void main(String[] args) {
        Person one = new Person("高圆圆",11);
        System.out.println(one.name);

        //匿名对象
        new Person("高圆圆",11);//使用建议：只是使用唯一的一次


    }




}
