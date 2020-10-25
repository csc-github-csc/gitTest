package innerPackage;

/**
 * 局部内部类 只有 当前所属方法才能够使用它
 *
 */
public class Demo2Outer {

    public void methodOuter(){
        class Inner{        //局部内部类，定义在方法里面的
            int num = 10;
            public void methodInner(){
             System.out.println("局部内部类："+num);
            }
        }
        Inner inner = new Inner();
        inner.methodInner();
    }
}
