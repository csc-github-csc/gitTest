package extendsPackage;

/**
 * 在子类的继承关系当中，如果成员变量重名，则创建子类对象时，访问有两中方式：
 *  1、直接通过子类对象访问成员变量：
 *      等号左边是谁，就优先用谁，没有则向上找。
 *
 *  2、间接通过成员方法访问成员变量：
 *      该方法属于谁，就优先用谁，没有则向上找。
 */



public class Demo2Variable {

    static class Fu{
        int num = 10;
        int numFu = 20;
        public void method2(){
            System.out.println(num);
        }
    }

    static class Zi extends Fu{
        int num = 30;
        int numZi = 40;
        public void method(){

            System.out.println(num);
            System.out.println(super.num);
        }

        public void method1(){
            System.out.println(numFu);//子类当中的方法，父类当中的成员变量
        }
    }

    public static void main(String[] args) {
        Zi zi = new Zi();

        System.out.println(zi.numFu);
        System.out.println(zi.num);
        System.out.println(zi.numZi);
        zi.method();

        System.out.println("============");

        //等号左边是谁，就优先用谁
        Fu zi1 = new Fu();
        Zi zi2 = new Zi();
        System.out.println(zi1.num); //等号左边是Fu
        System.out.println(zi2.num);//等号左边是Zi
        zi2.method2();
        zi2.method1();


    }


}
