package String;

public class DoubleFor {
    public static void main(String[] args) {
        int i,j;
        int n=10;
        for(i=1;i<=n;i++){
            for(j=0;j<i;j++){
                System.out.print("  "+"j="+j);
            }
            System.out.println(""+"i="+i);
        }
        /**
         * 双层for循环，
         *  代码是一行一行执行的
         *  其中每次进入内循环（对该程序而言）j都会初始化为0
         *
         *
         */

    }

}
