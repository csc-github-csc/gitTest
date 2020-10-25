package polymorphicPackage;
//对象的多态性

/**polymorphic或者mutil  多态
 *
 *
 *
 */
public class Demo1 {
    public void methodFu(){
        System.out.println("这是一个父类的方法！");
    }

    static class Zi extends Demo1{
        public  void methodZi(){
            System.out.println("这是子类的方法！");
        }

    }

    public static void main(String[] args) {
        Demo1 zi = new Zi();
        //多态的写法，父类引用指向子类对象
        //这样子的话new出来的实例对象，只有从父类当中继承过来的方法，子类自己的方法没有
        zi.methodFu();
        System.out.println(zi.getClass());
        System.out.println("=====");
        Zi zi1 = new Zi();
        zi1.methodZi();
        zi1.methodFu();
    }
}
