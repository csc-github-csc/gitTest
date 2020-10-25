package extendsPackage;

/**
 * this的三种用法
 * this.成员变量名;  调用本类中的成员变量
 * this.成员方法（）; 在本类的一个成员方法中调用本类中的另一个成员方法
 * 构造函数第一条且仅有一条this(...); 在本类的构造方法中调用本类的另一个构造方法
 */
public class Demo9This {

    static class Fu{
        int num = 10;
    }

    static class Zi extends Fu{
        int num = 20;
        public void methodA(int num){
            System.out.println(num);//调用局部变量
            System.out.println(this.num);//调用成员变量
            System.out.println(super.num);//调用父类中的同名变量
        }

        public Zi(){

        }

        public Zi(int n){
            this();//在本类的 构造方法中 调用本类当中的另一个 构造方法
           // this(10,20);这是错误写法，，一个构造方法里不能同时出现两个this(..)
            //super();这也是错误写法，，，都得是构造函数中的第一条语句，一山不容二虎
        }

        public Zi(int n,int y){
        }

        public void methodB(){
            this.methodA(10);//调用本类的另一个构造方法。
            this.methodC();
            System.out.println("====");
        }

        public void methodC(){

        }

    }


}
