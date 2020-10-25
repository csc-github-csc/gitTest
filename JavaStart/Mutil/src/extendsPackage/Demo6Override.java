package extendsPackage;

/**
 * 覆盖重写的应用
 *
 *
 */
public class Demo6Override {

    static class Phone{
        public void call(){
            System.out.println("打电话");
        }
        public void send(){
            System.out.println("发短信");
        }
        public void show(){
            System.out.println("显示号码");
        }
    }

    static class NewPhone extends Phone{
        @Override
        public void show() {
            super.show();  //用super去调用父类中原有的方法，而不是在
                            //子类中，再重写一遍，，万一这个方法有几百行代码呢？？？
            System.out.println("显示头像");
            System.out.println("显示照片");
        }
    }

    public static void main(String[] args) {
        NewPhone newPhone = new NewPhone();
        newPhone.call();
        newPhone.send();
        newPhone.show();
    }
}
