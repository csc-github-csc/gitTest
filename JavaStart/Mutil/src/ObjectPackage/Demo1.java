package ObjectPackage;

/**
 * Object类的equals方法：public boolean equals(Object obj);
 * 该方法的源码是：
 *      public boolean equals(Object obj){
 *          return this == obj;
 *      }
 *      以上所知没重写equals方法之前，其实就是在用 == 比较运算符在进行比较：所以规则如下：
 *      基本数据类型：比较内容
 *      引用数据类型：比较地址值
 */
public class Demo1 {
    public static void main(String[] args) {
        Person one = new Person("迪丽热巴",18);
        Person two = new Person("古力娜扎", 19);
        Person three = new Person("迪丽热巴",18);
        System.out.println(one.equals(two));//false  引用数据类型，比较地址值
       /*/ System.out.println(one.equals(three)); //false

        /*重写equals方法*/
        System.out.println(one.equals(three));//true 重写后比较的是属性的值


    }
}
