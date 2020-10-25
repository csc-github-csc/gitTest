package innerPackage;

public class DemoBody {


    public static void main(String[] args) {
        new Body().methodOuter(); //匿名对象  间接访问

        Body.Heart heart = new Body().new Heart();//直接创建内部类对象进行访问
        heart.methodInner();


    }
}
