package polymorphicPackage;



/**
 * 对象的向上转型（向上：继承关系）  父类引用指向子类对象
 *
 * 对象的向上转型其实就是多态的写法
 *  从小范围到大范围 （例如：把一只猫当做动物来看待）
 *  所以：对象的向上转型一定是安全的。
 *
 *
 */
public abstract class Demo4MutilUpAndDown {
    public abstract void eat();



    static class Cat extends Demo4MutilUpAndDown{



        public void eat() {
            System.out.println("猫吃鱼！");
        }

        public void catchMouse(){
            System.out.println("猫抓老鼠！！！");
        }
    }

    static  class Dog extends Demo4MutilUpAndDown{
        @Override
        public void eat() {
            System.out.println("狗吃骨头！");
        }
        public void watchHouse(){
            System.out.println("看家！！！");
        }
    }


    public static void GiveMeAPet(Demo4MutilUpAndDown animal){
        if(animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.eat();
            dog.watchHouse();
        }
        if(animal instanceof Cat){
            Cat cat = (Cat)animal;
            cat.eat();
            cat.catchMouse();
        }
    }

    public static void main(String[] args) {
        Demo4MutilUpAndDown cat = new Cat();//
        //本来是猫，被当做动物了（弊端：无法调用子类独有的方法）
        cat.eat();

        Cat cat1 = (Cat)cat;
        cat1.catchMouse();
        cat.eat();

        //以下是错误写法：报错ClassCastException：类转换异常
        //Dog dog = (Dog)cat;
        //dog.eat();

        //用instanceof关键字判断是不是属于该类型
        if(cat instanceof Dog){
            Dog dog = (Dog)cat;
            dog.eat();
            dog.watchHouse();
        }
        if(cat instanceof  Cat){
            Cat cat2 = (Cat)cat;
            cat2.eat();
            cat2.catchMouse();
        }

        GiveMeAPet(new Dog());

    }
}
