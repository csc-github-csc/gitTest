package innerPackage;

public class Body {
    public class Heart{

        public void methodInner(){
            System.out.println("心脏是内部类！");

        }
    }

    public void methodOuter(){
        System.out.println("身体是外部类！");

        Heart heart = new Heart();  //间接访问内部类
        heart.methodInner();
    }
}
