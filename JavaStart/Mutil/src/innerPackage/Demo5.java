package innerPackage;

public class Demo5 {

    public static void main(String[] args) {
        Demo5Hero hero = new Demo5Hero();
        hero.setName("李白");
        hero.setAge(20);
        Demo5Weapon weapon = new Demo5Weapon();
        weapon.setCode("青莲剑");
        hero.setWeapon(weapon);
        hero.attck();

    }
}
