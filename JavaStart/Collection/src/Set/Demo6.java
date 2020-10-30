package Set;

public class Demo6 {
    public static void main(String[] args) {
        /*可变参数：
        * 已知参数类型，不是到参数个数
        *
        * 比如：计算整数的和
        * */
        int sum1 = getSum1(1);//地址：[I@4554617c  长度：1  sum:1 相当于 new int[1]
        int sum2 = getSum1(10, 20, 30);//地址：[I@74a14482 长度：3 sum:60  相当于new int[3]

        int sum3 = getSum2(new int[1]);//地址：[I@1540e19d  长度：1 sum:0 只是定义了大小，没有赋值
        int sum4 = getSum2(new int[3]);//地址：[I@677327b6 长度：3 sum:0


    }

    public static int getSum1(int...arrays){
        System.out.println("arrays可变参数的地址："+arrays);
        System.out.println("array可变参数的长度："+arrays.length);//说明底层就是一个数组
        int result = 0;
        for (int i = 0; i <arrays.length ; i++) {
            result+=arrays[i];
        }
        System.out.println("sum:"+result);
        return result;
    }
    public static int getSum2(int[] arrays){
        System.out.println("arrays参数的地址："+arrays);
        System.out.println("array参数的长度："+arrays.length);
        int result = 0;
        for (int i = 0; i <arrays.length ; i++) {
           result+=arrays[i];
        }
        System.out.println("sum:"+result);
        return result;
    }


}
