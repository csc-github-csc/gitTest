package abstractPackage;

/**
 * 抽象方法所在的类，必须是抽象类。抽象类里可以有普通方法。
 * 抽象方法 在返回值类型前加abstract关键字，去掉方法体（抽象方法不知道具体的实现方式）
 *
 *
 */

public abstract class Demo1Abstract {
    public abstract void eat();


    public void normalMethod(){
        System.out.println("抽象类里面可以定义普通方法");
    }


   static class ziDemo1 extends Demo1Abstract{
        @Override
        public void eat() {
            System.out.println("maochiyu");
        }
    }


    public static void main(String[] args) {
       // Demo1Abstract demo1Abstract = new Demo1Abstract();//错误写法
        //抽象类不能被实例化！！！  你不能说创建一个动物，只能说具体到猫，狗。。。。
        ziDemo1 ziDemo1 = new ziDemo1();
        ziDemo1.eat();
        ziDemo1.normalMethod();
    }
}
