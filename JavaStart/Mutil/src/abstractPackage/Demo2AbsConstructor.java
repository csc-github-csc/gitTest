package abstractPackage;

public abstract class Demo2AbsConstructor {
    public Demo2AbsConstructor(int a){
        System.out.println("抽象父类构造方法执行！"+a);
    }
    public abstract void eat();

    static class ZiDemo2 extends Demo2AbsConstructor{
        @Override
        public void eat() {
            System.out.println("子类覆盖重写父类eat方法：吃东西");
        }
        public ZiDemo2(){
            //super();//编译器默认赠送super();
            super(10);
            System.out.println("子类构造方法执行！");
        }
    }
    public static void main(String[] args) {
        ZiDemo2 ziDemo2 = new ZiDemo2();
        ziDemo2.eat();
    }


}
