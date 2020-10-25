package extendsPackage;

public class Demo5Override {

    static class Fu{
        public Object method(){
            System.out.println("父类的方法重写！");
            return null;
        }

        private void method1(){
            System.out.println("private修饰符method1");
        }
    }

    static class Zi extends Fu{

        /**
         * 覆盖重写的权限修饰符： 子类 【大于等于】 父类权限修饰符
         * public > protected > (default) > private
         *
         * 注意（default）不是关键字default，而是不写修饰符，留空
         *
         */

         void method1(){
            System.out.println("无修饰符method1");
        }











        //覆盖重写返回值小于或等于父类的方法返回值范围
         //java.lang.Object是所有类的父类（祖宗类）
        @Override
        public String method() {
            System.out.println("子类的方法重写!");
            return null;
        }
//        @Override
//        public Object method(){
//            System.out.println("子类的方法重写2");
//            return null;
//        }
        //一个类中不能出现两个（方法名相同且参数列表相同返回类型不一样）的方法！！！！










        /*public int method(){
            return 0;
        }*/  //这是错误写法，因为method（）方法已经在前面定义过了


        /*public void method(int num){
            System.out.println(num);
        }*/  //这是方法的重载，方法名一样，参数列表不一样。


    }
}
