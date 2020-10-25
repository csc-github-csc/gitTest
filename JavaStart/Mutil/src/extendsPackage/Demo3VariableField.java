package extendsPackage;

/**
 * 局部变量，子类成员变量，父类成员变量
 *  局部变量：直接写
 *  本类成员变量：this.成员变量
 *  父类成员变量：super.成员变量
 */


public class Demo3VariableField {

    static class Fu{
        int num = 10;

    }

    static class Zi extends Fu{
        int num = 20;

        public void method(int num){
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(super.num);
        }
    }


    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.method(30);
    }





}
