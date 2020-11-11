package Thread;

import java.util.Arrays;
import java.util.Comparator;

public class Lambda3 {
   static class Person{
        private String name;
        private int age;

        public Person() {
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
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

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

    }
    public static void main(String[] args) {
         Person[] arr = {
                 new Person("A",10),
                 new Person("B",20),
                 new Person("C",30)
         };
         //比较
       /* Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });*/
        //使用Lambda
        Arrays.sort(arr, (o1,o2)->{return o1.getAge() - o2.getAge();});
        //遍历
        for(Person p : arr){
            System.out.println(p);
        }

    }
}
