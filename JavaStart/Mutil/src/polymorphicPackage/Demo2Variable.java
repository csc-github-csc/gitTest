package polymorphicPackage;

public class Demo2Variable {
    public Demo2Variable(){
        System.out.println("父类构造方法！");
    }

    int num = 10;
    public void method(){
        System.out.println(num);
    }

    static class Zi extends Demo2Variable{
        int num = 20;
        int age =2000;

        @Override
        public void method() {
            System.out.println(num);
        }

        public void method1(){
            System.out.println("子类独有的方法！");
        }
    }

    public static void main(String[] args) {
        Demo2Variable zi = new Zi();
        System.out.println(zi.num);//10
        //zi.age;错误写法！！！


        //子类没有覆盖重写，就是父：10
        //子类如果覆盖重写，就是子：20
        zi.method();



    }



}
