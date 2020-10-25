package innerPackage;

//局部内部类要想访问所在方法的局部变量，该变量必须是有效final的。

public class Demo3MyOuter {

    public void method(){
        final  int num = 10;


        class Inner{
            public void methodInner(){
                System.out.println(num);
            }
        }


    }
}
