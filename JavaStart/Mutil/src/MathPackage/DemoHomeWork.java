package MathPackage;

public class DemoHomeWork {
    public static void main(String[] args) {
        //Math相关的api
        // /*
        // abs(),ceil(),floor(),round()
        //
        // **/计算在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少？

        double min = -10.8;
        double max = 5.9;             //-10---5.9
        int numAbs = 0;
        for (int i=(int)Math.ceil(min); i < max ; i++) {
            if(Math.abs(i) > 6 || Math.abs(i) < 2.1)
                numAbs+=1;
            System.out.println(i);
        }
        System.out.println(numAbs);






    }
}
