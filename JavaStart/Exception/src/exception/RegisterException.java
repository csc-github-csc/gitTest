package exception;
/*
自定义异常类：注册异常
 */
public class RegisterException extends Exception {
    //添加一个空参数的构造方法
    public RegisterException(){
        super();
    }
    /*
    添加一个带异常信息的构造方法
    查看源码发现，所有的异常类都会有一个带异常信息的构造方法，方法内部会调用
    父类带异常信息的构造方法，让父类去处理这个异常
     */
    public RegisterException(String message){
        super(message);
    }
       //但是这个自定义的异常类没有任何意义，只是作为举例，

}
