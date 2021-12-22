package com.xjh.jdbctest;

import com.xjh.jdbcutil.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入用户名：");
//        String username = sc.next();
//        System.out.println("请输入密码：");
//        String password = sc.next();

        Connection conn = null;
        Statement statement = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConn();
            statement = conn.createStatement();
            String sql = "select * from user";
            rs = statement.executeQuery(sql);
            while(rs.next()) {
                String username1 = rs.getString("username");
                String password1 = rs.getString("password");
                System.out.println(username1);
                System.out.println(password1);
            }

//            if(username.equals(username1) && password.equals(password1)){
//                System.out.println("登陆成功");
//            }else {
//                System.out.println("用户名或密码错误。。。");
//            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(conn,statement,rs);
        }
    }
}
