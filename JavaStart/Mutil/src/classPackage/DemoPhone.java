package classPackage;

public class DemoPhone {
    public static void main(String[] args) {
        Phone phone = new Phone();
        System.out.println(phone.brand);//null
        System.out.println(phone.price);//0.0
        System.out.println(phone.color);//null

        phone.brand = "三星";
        phone.price = 4999.0;
        phone.color = "极光紫";
        System.out.println(phone.brand);//三星
        System.out.println(phone.price);//4999.0
        System.out.println(phone.color);//极光紫

        phone.call("乔布斯");
        phone.sendMessage();

    }
}
