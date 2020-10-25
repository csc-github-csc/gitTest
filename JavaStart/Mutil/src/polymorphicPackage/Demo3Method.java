package polymorphicPackage;

public class Demo3Method {

    public void methodCommon(){
        System.out.println("父子类共有的方法！");
    }

    public void methodFu(){
        System.out.println("父类特有方法！");
    }

    static class Zi extends Demo3Method{

        @Override
        public void methodCommon() {
            System.out.println("子父类共有的方法！");
        }

        public void methodZi(){
            System.out.println("子类特有方法！");
        }
    }

    public static void main(String[] args) {
        Demo3Method zi = new Zi(); //多态
        zi.methodCommon();      //父子都有，优先用子
        zi.methodFu();          //子类没有，父类有，所以向上找到父类
    }

}
