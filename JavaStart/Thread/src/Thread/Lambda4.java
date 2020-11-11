package Thread;

/**
 * 给定一个计算器Calculator接口，内含抽象方法calc可以将两个int数字相加得到和的值
 *
 */
public class Lambda4 {
    interface Calculator{
        int calc(int x,int y);
    }
    static int invokeCalc(int x,int y,Calculator c){
        return c.calc(x,y);
    }

    public static void main(String[] args) {
        int sum = invokeCalc(1999, 2788, new Calculator() {
            @Override
            public int calc(int x, int y) {
                return x+y;
            }
        });
        //Lambda
        int sum1 = invokeCalc(1888,78787,(x,y)->{return x+y;});

        System.out.println(sum);//4787
        System.out.println(sum1);//80675
    }

}
