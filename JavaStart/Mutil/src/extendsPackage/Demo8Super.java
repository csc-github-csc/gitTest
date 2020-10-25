package extendsPackage;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

/**
 *
 * super关键字的三种用法
 * 1.访问父类的成员变量
 * 2.访问父类的成员方法
 * 3，访问父类的构造方法
 */
public class Demo8Super {

    static class Fu{
        int numFu;

        public Fu(){
            System.out.println("父类的无参构造！");
        }

        public void methodFu(){
            System.out.println("父类的成员方法！");
        }
    }


    static class Zi extends Fu{
        public Zi(){
            super();
        }

        public void methodZi(){
            super.methodFu();
        }

        int numZi = super.numFu;

    }



}
