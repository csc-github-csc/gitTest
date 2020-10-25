package extendsPackage;

/**
 * 在继承的关系中：“子类就是一个父类” 也就是说 子类可以当做父类来看待
 *例如父类是员工，子类是讲师，那么”讲师就是一个员工“  关系 is-a
 *
 * 定义父类的格式：（一个普通的类的定义）
 * public class 父类名称{
 *     //.....
 * }
 *
 * 子类的格式：
 * public class 子类名称 extends 父类名称{
 *     //.....
 * }
 *
 */

public class Demo1 {

    static class Employee {
      public void method(){
          System.out.println("这是一个父类");
      }
    }
    static class Teacher extends Employee{
        @Override
        public void method() {
            System.out.println("这是一个子类");
        }
    }

    static class Assistant extends Employee{

    }


    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.method();
        Assistant assistant = new Assistant();
        assistant.method();
    }

}
