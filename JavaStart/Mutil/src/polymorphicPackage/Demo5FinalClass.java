package polymorphicPackage;

//不能使用一个final来作为一个父类

/**
 * final 最终的，不可改变的。
 *
 *
 */
public final class Demo5FinalClass /*extends Object*/ {

    public void Print(){

        System.out.println("final修饰类可以有父类，不能有子类，不能被继承");
    }

    public final void method(){
        System.out.println("被final修饰的方法，不能别子类覆盖重写！");
    }
}
