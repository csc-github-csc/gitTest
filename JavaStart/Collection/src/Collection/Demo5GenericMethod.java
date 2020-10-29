package Collection;

public class Demo5GenericMethod {
    public static void main(String[] args) {
        GenericMethod gc = new GenericMethod();
        gc.method("aaa");//aaa
        gc.method(1);//1
        GenericMethod.methodStatic(true);//true
    }
}
