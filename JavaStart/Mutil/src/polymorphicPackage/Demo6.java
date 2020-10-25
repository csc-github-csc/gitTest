package polymorphicPackage;


/**
 * 被final修饰的变量：
 *
 *  基本数据类型，不可变说的是数据不可变
 *  对于引用数据类型，不可变说的是内存地址不可变，，，内容可以改变。
 *
 *
 */
public class Demo6 {

    public static void main(String[] args) {
        Demo6Student demo6Student =new Demo6Student("赵丽颖");
        System.out.println(demo6Student);
        demo6Student = new Demo6Student("霍建华");
        System.out.println(demo6Student);

        System.out.println("=========");


        final Demo6Student student = new Demo6Student("高圆圆");
        //student = new Demo6Student("高圆圆");//错误写法，不能改变一个被final修饰的变量
        System.out.println(student);
        student.setName("高圆圆圆圆");
        System.out.println(student);

    }
}
