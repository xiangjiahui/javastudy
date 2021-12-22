package com.xjh.jdbctest;

import com.xjh.jdbcutil.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * 练习：需求：
 *          1.通过键盘录入用户名和密码
 *          2.判断用户是否登陆成功
 */
@SuppressWarnings("all")
public class Register {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.next();
        System.out.println("请输入密码：");
        String password = sc.next();

        boolean flag = new Register().login(username, password);

        if(flag){
            System.out.println("登陆成功!");
        }else {
            System.out.println("用户名或密码错误");
        }
    }

    /**
     * 登陆方法
     */
    public boolean login(String username, String password){
        if(username == null || password ==null){
            return false;
        }
        //连接数据库判断是否登陆成功
        Connection conn = null;
        Statement statement = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConn();
            statement = conn.createStatement();
            String sql = "select * from user where username = '"+username+"' and password = '"+password+"'";
            rs = statement.executeQuery(sql);
            return rs.next();//如果有下一行，则返回true
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(conn,statement,rs);
        }

        return true;
    }
}
