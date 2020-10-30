package List;

import java.util.LinkedList;

public class DemoLinkedList {
    public static void main(String[] args) {
        /*LinkedList集合特有的方法*/
        //创建LinkedList对象不能使用多态
        LinkedList<String>  linkedList = new LinkedList<>();

        /*添加：add()*/
        linkedList.add("a"); linkedList.add("b"); linkedList.add("c");
        System.out.println(linkedList);//[a,b,c]
        linkedList.addFirst("www");
        System.out.println(linkedList);//[www,a,b,c]
        /*push()效果等同于addFirst()*/
        linkedList.push("w");//[w,www,a,b,c]
        /*addLast()效果等同于add()*/
        linkedList.addLast("w");//[w,www,a,b,c,w]

        /*getFirst();getLast();isEmpty()*/
        if(!linkedList.isEmpty()){
            System.out.println(linkedList.getFirst());//w
            System.out.println(linkedList.getLast());//w
        }

        /*removeFirst();removeLast();*/
        System.out.println(linkedList.removeFirst());//w 返回移除的元素
        System.out.println(linkedList.removeLast());//w  返回移除的元素
        /*pop()相当于removeFirst()*/
        System.out.println(linkedList.pop());//www 返回移除的元素
        /*clear()清空集合中的元素，但集合还在*/
        linkedList.clear();
        System.out.println(linkedList);//[]


    }
}
