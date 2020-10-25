package extendsPackage;

/**
 * 在父子的继承关系当中，创建子类对象，访问成员方法的规则：
 * 		等号左边是谁，就优先用谁，如果没有则向上找
 * 	注意事项：
 * 		无论是成员变量还是成员方法，如果没有都是向上找父类，绝对不会向下找子类。
 *
 *
 */
public class Demo4Method {

    static class Fu{
        public void method(){
            System.out.println("这是父类的重名方法！");
        }

        public void methodFu(){
            System.out.println("父类方法！");
        }
    }

    static class Zi extends Fu{
        public void method(){
            System.out.println("这是子类的重名方法！");
        }
        public void methodZi(){
            System.out.println("子类方法！");
        }
    }

    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.method();
        zi.methodZi();
        zi.methodFu();

        Fu zi1 = new Zi(); //等号左边是Fu,所以优先用Fu类的重名方法
        zi1.method();
    }
}
