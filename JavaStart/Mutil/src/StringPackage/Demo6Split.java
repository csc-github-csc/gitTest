package StringPackage;
//**分割字符串的方法
public class Demo6Split {
    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc";
        String[] splitStr1 = str1.split(",");
        System.out.println(splitStr1);//[Ljava.lang.String;@4554617c（地址值）
        for (int i = 0; i <splitStr1.length ; i++) {
            System.out.println(splitStr1[i]);//aaa，bbb，ccc 按照空格分割也可以,不再举例
        }
        /**/
        String str3 = "aaa.bbb.ccc";
        String[] splitStr3 = str3.split(".");
        for (int i = 0; i <splitStr3.length ; i++) {
            System.out.println(splitStr3[i]); //输出为空
        }
        System.out.println(splitStr3);//输出为0，  以上说明转换失败，正确写法是下面的
        /*
        String str3 = "aaa.bbb.ccc";
        String[] splitStr3 = str3.split("\\.");
        for (int i = 0; i <splitStr3.length ; i++) {
            System.out.println(splitStr3[i]); //aaa bbb ccc
        }
        * */


        
    }
}
