package com.xjh.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * jdbc快速入门
 *executeUpdate(String sql)执行DML(insert,delete,update)语句、DDL(create,alter,drop)语句
 * executeQuery(String sql)执行DQL(select)语句
 */
public class Demo01Jdbc {
    public static void main(String[] args) throws Exception{
        //1.导入jar包
        //2.注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //3.获取连接数据库对象
//        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my", "root", "root");
        //如果连接的是本机的数据库，可简写
        Connection conn = DriverManager.getConnection("jdbc:mysql:///my", "root", "root");
        //4.定义sql语句
        String sql = "update account set balance = 500 where id = 1";
        //5.获取执行sql的对象Statement
        Statement statement = conn.createStatement();
        //6.执行sql
        int update = statement.executeUpdate(sql);//返回值：受影响的数据库数据行数
        //7.处理结果
        System.out.println(update);
        //8.释放资源
        statement.close();
        conn.close();
    }
}
