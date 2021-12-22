package com.xjh.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *  JDBC练习：account表 修改一条记录
 */
@SuppressWarnings("all")
public class Demo03Jdbc {
    public static void main(String[] args) {
        Connection conn = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///my","root","root");
            statement = conn.createStatement();
            String sql = "update account set balance = 2000 where id = 3";
            int i = statement.executeUpdate(sql);
            System.out.println(i);
            if(i > 0){
                System.out.println("修改成功");
            }else {
                System.out.println("修改失败");
            }
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}
