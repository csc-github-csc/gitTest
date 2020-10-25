package innerPackage;

public class Demo6Hero {
    private String name;
    private Demo6Skill skill;

    public void attack(){
        System.out.println("我叫"+name+"开始释放技能");


    }

    public Demo6Hero() {
    }

    public Demo6Hero(String name, Demo6Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Demo6Skill getSkill() {
        return skill;
    }

    public void setSkill(Demo6Skill skill) {
        this.skill = skill;
    }
}
