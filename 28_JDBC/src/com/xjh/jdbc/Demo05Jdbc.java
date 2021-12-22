package com.xjh.jdbc;

import java.sql.*;

/**
 * JDBC
 * executeQuery(String sql)执行DQL(select)语句
 * ResultSet:结果集对象，封装查询结果
 *boolean  next()游标向下移动一行，判断当前行是否是最后一行，不是返回true，是返回false
 * get数据类型(参数)获取数据
 */
@SuppressWarnings("all")
public class Demo05Jdbc {
    public static void main(String[] args) {
        Connection conn = null;
        Statement statement = null;
        ResultSet res = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///my", "root", "root");
            statement = conn.createStatement();
            String sql = "select * from account";
            res = statement.executeQuery(sql);
            //让游标下移一行，移动到数据行
            //循环判断游标是否是最后一行
            //可不写re.next() == true
            while(res.next()){
                //re.getInt(columnIndex: 1);columnIndex代表表的列数(第几列)
                int id = res.getInt("id");
                String name = res.getString("name");
                double balance = res.getDouble("balance");
                System.out.println(id+"——"+name+"——"+balance);
            }
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            if(res != null){
                try {
                    res.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}