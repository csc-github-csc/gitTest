package Collection;


public class Demo4GenericCalss {
    public static void main(String[] args) {
        /*不写泛型，默认是Object类型*/
        GenericClass gc1 = new GenericClass();
        gc1.setName(true);

        /*泛型为Integer*/
        GenericClass<Integer> gc2 = new GenericClass<>();
        gc2.setName(111);
        System.out.println(gc2.getName());//111
        /*泛型为String*/
        GenericClass<String> gc3 = new GenericClass<>();
        gc3.setName("AAA");
        System.out.println(gc3.getName());//AAAA

    }
}
