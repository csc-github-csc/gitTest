package packPackage;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
        /*
        自动装箱：
        Integer in = 1；就相当于 Integer in = new Integer（1）；
         */
        Integer in = 1;
        /*
        自动拆箱：in是包装类，无法直接参与运算，就可以自动转换为基本数据类型，再进行计算
        in+2;就相当于in.inValue()+2=3
        in = in.inValue()+2=3又是一个自动装箱
         */
        in = in+2;
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);//-->自动装箱list.add(new Integer(1));
        int a = arrayList.get(0);//-->自动拆箱：list.get(0).intValue();

    }
}
