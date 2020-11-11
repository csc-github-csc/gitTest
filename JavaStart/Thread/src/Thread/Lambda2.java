package Thread;

public class Lambda2 {
    interface Cook{
        void makeFood();
    }

    static void invokeCook(Cook cook){
        cook.makeFood();
    }
    public static void main(String[] args) {
            invokeCook(new Cook() {
                @Override
                public void makeFood() {
                    System.out.println("做饭饭！");
                }
            });
            //Lambda表达式
        invokeCook( ()->{
            System.out.println("做饭饭！");
        } );

    }
}
