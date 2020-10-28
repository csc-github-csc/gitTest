public class JdbcDemo1 {
    /**1.导入数据库相关jar包
     * 1.1复制驱动jar包到lib(自己新建的)文件夹下
     * 1.2右键，把lib文件夹添加为lib
     *
     * 2.注册驱动Class.forName("com.mysql,jdbc.Driver")(此处需要抛出或者处理异常)
     *
     * 3.获取数据库连接对象
     * DriverManager.getConnection(url,username,password)
     *
     * 4.定义sql语句
     * String sql = "update account set balance = 100 where id = 1"
     *
     * 5.获取执行sql的对象，Statement
     * Statement stmt = conn.createStatement();
     *
     * 6.执行sql
     * int count = stmt.executeUpdate(sql);
     *
     * 7.处理结果
     * sout(count);
     *
     * 8.释放资源（以免造成内存泄露问题）
     * stmt.close();
     * conn.close();
     *
     */
}
