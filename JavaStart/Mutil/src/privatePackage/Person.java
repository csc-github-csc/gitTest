package privatePackage;

import java.util.Date;

/*
* 用private修饰成员变量
* 本类当中仍然可以随意访问
* 出了本类不能直接访问，但可以间接访问，用getter和setter方法
* */
public class Person {
   public String name;
    private int age;
    private String sexStr;  //网页上传1,0表示男和女
    private int sex;

    //再来个时间格式的转换
    private Date date;   //数据库存的数据是Date类型的
    private String dateStr; //网页上显示的是String类型的

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDateStr() {
        if(this.date!=null){
            dateStr = Date_StringUtils.getDateStr(date);
        }else{
            System.out.println("未填写具体日期");
            return null;
        }
        return dateStr;
    }

    public void setDateStr(String dateStr) {
        this.dateStr = dateStr;
    }

    public void show(){
        System.out.println("My Name is:"+name+","+age+"years old.");
    }

    public  void setAge(int age){
        if(age<0||age>100){
            System.out.println("数据不合理！");
            return;
        }
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setSex(int sex){
        this.sex = sex;
    }
    public int getSex(){
        return this.sex;
    }

    public String getSexStr() {
        sexStr = this.sex==0?"女":"男";
        return sexStr;
    }

    public void setSexStr(String sexStr) {
        this.sexStr = sexStr;
    }
}
