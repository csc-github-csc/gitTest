package innerPackage;

public class Demo5Hero {
    private String name;//名字
    private int age;//年龄
    private Demo5Weapon weapon;//英雄使用的武器



    public void attck(){
        System.out.println("年龄"+age +"的"  + name + "用" + weapon.getCode() +"攻击敌人");
    }

    public Demo5Hero() {
    }

    public Demo5Hero(String name, int age, Demo5Weapon weapon) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Demo5Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Demo5Weapon weapon) {
        this.weapon = weapon;
    }
}
