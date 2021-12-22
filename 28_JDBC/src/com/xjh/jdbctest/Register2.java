package com.xjh.jdbctest;



import com.xjh.jdbcutil.JDBCUtils;

import java.sql.*;
import java.util.Scanner;

/**
 * 练习：需求：
 *          1.通过键盘录入用户名和密码
 *          2.判断用户是否登陆成功
 */
@SuppressWarnings("all")
public class Register2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.next();
        System.out.println("请输入密码：");
        String password = sc.next();

        boolean flag = new Register2().login(username, password);

        if(flag){
            System.out.println("登陆成功!");
        }else {
            System.out.println("用户名或密码错误");
        }
    }

    /**
     * 登陆方法，使用PreparedStatement，增加安全性
     * 以后都将使用PreparedStatement对象来完成增删改等一系列的操作
     */
    public boolean login(String username, String password){
        if(username == null || password ==null){
            return false;
        }
        //连接数据库判断是否登陆成功
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConn();
            //使用?作为占位符
            String sql = "select * from user where username = ? and password = ?";
            //不在使用Statement，而是使用PreparedStatement
            ps = conn.prepareStatement(sql);
            //给?赋值
            ps.setString(1,username);
            ps.setString(2,password);
            //rs = statement.executeQuery(sql);
            //有专有的执行方法，不在需要传递参数
            rs = ps.executeQuery();
            return rs.next();//如果有下一行，则返回true
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(conn,ps,rs);
        }

        return false;
    }
}

