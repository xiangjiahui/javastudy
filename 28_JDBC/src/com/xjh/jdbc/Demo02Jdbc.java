package com.xjh.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * JDBC练习：account表 添加一条记录
 * 使用try catch处理异常才是标准的格式
 */
@SuppressWarnings("all")
public class Demo02Jdbc {
    public static void main(String[] args) {
        Connection conn = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///my", "root", "root");
            statement = conn.createStatement();
            String sql = "insert into account(id,name,balance) values(null,'王五',3000)";
            int i = statement.executeUpdate(sql);
            System.out.println(i);
            if(i > 0){
                System.out.println("添加成功");
            }else {
                System.out.println("添加失败");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //避免空指针异常，需要进行判断
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
