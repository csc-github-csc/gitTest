package Collection;

/**
 * 定义含有泛型的接口
 */
public class GenericInterfaceImpl implements GenericInterface {

    @Override
    public void method(Object o) {
        System.out.println(o);
    }
}
