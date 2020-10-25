package extendsPackage;

/**
 *
 *
 *
 *
 */
public class Demo7Constructor {

    static class Fu{
        public Fu(int num){
            System.out.println("父类的有参构造！"+num);
        }
        public Fu(){
            System.out.println("父类的无参构造！");
        }
    }

    static class Zi extends Fu{
        public Zi(){
            super(10);//这是编译器默认赠送的父类无参构造，不写，也会有，只是隐藏了。
                    //注意位置是在子类的构造函数中。

            //当父类有了有参构造函数后，子类的super（）；就不再赠送，要自己写
                //super（参数）；

            System.out.println("子类的构造方法！");
        }

        public Zi(int num){
            super();
            System.out.println("子类的有参构造"+num);
        }

        public void method(){
            //super();  错误写法，只有子类构造方法才能调用父类构造方法
        }

    }


    public static void main(String[] args) {
        Zi zi = new Zi();
        Zi zi1 = new Zi(18);

    }



}
