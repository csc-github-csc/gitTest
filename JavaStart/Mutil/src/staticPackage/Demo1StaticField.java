package staticPackage;

import javax.xml.bind.SchemaOutputResolver;

public class Demo1StaticField {

    public static void main(String[] args) {
        Demo1Student one = new Demo1Student("郭靖",19);

        //one.room = "101教室"; 不推荐，因为静态和对象无关
        Demo1Student.room = "101教室";

        System.out.println(one.room+"=="+one.getId());
        Demo1Student two = new Demo1Student("黄蓉",19);
        System.out.println(two.room+"==="+two.getId());


    }
}
