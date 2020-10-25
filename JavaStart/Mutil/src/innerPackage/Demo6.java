package innerPackage;

public class Demo6 {

    public static void main(String[] args) {
        Demo6Hero hero = new Demo6Hero();
        hero.setName("李白");

        Demo6Skill skill = new Demo6Skill() { //匿名类，，至于实现类我省略了
            @Override
            public void useSkill() {
                System.out.println("青莲剑歌出手");
            }
        };
        hero.setSkill(skill);
        hero.attack();




        hero.setSkill(new Demo6Skill() {  //匿名对象
            @Override
            public void useSkill() {
                System.out.println("使用技能青莲剑歌");
            }
        });
        hero.attack();


    }

}
