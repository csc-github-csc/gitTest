package exception;

public class Demo2 {
    public static void main(String[] args) {
        /*
        * 以后（工作中）我们首先必须对方法传递过来的参数进行合法性校验，
        *如果参数不合法，那么我们就必须使用抛出异常的方式，告知方法的调用者，
        * 传递的参数有问题
        * */
        //int[] arry = new int[0];
        int[] arry = new int[3];
        //getElem(arry,1);
        getElem(arry,2);
    }
    public static int  getElem(int[] arry,int index){
        /*
        我们可以对传递过来的参数数组，进行合法性的校验
        如果数组arry的值是null
        那么我们就抛出空指针异常，告知方法的调用者“传递的数组的值是null”;
         */
        if(arry==null||arry.length==0){
            throw new NullPointerException("传递的数组的值是null");
        }
        /*
        我们可以对传递过来的参数index进行合法性校验
        如果index的范围不在数组的索引范围内
        那么我们就抛出数组索引越界异常，告知方法的调用者“传递的索引值超过了数组索引的范围”
         */
        if(index<0||index>=arry.length){
            throw new ArrayIndexOutOfBoundsException("索引越界异常");
        }


        return 0;
    }

}
