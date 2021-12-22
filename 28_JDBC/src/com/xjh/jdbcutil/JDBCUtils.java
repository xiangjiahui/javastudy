package com.xjh.jdbcutil;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

/**
 * JDBC工具类：代码过于冗余，写一个工具类来简化代码的书写
 */
@SuppressWarnings("all")
public class JDBCUtils {
    private static String url;
    private static String user;
    private static String password;
    private static String driver;
    /**
     * 文件的读取，只需要读取一次即可。使用静态代码块(静态代码块随着方法的加载而执行，且只执行一次)
     */
    static {
        try {
            //读取资源文件，获取值
            //1.创建Properties集合类
            Properties pro = new Properties();
            //获取src路径下的文件的方式-->ClassLoader 类加载器
            ClassLoader cls = JDBCUtils.class.getClassLoader();
            URL resource = cls.getResource("jdbc.properties");
            String path = resource.getPath();
            //2.加载文件
            pro.load(new FileReader(path));
            //3.获取属性，赋值
            url = pro.getProperty("url");
            user = pro.getProperty("user");
            password = pro.getProperty("password");
            driver = pro.getProperty("driver");
            //4.注册驱动
            Class.forName(driver);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取连接方法
     * @return 连接对象
     * 为了方便，需要实现既不传参，同时还需要保证代码的动态性
     * 解决方案：使用配置文件:jdbc.properties
     */
    public static Connection getConn() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }

    /**
     * 释放资源方法
     * @param statement
     * @param conn
     */
    public static void close(Connection conn,Statement statement){
        if(conn != null){
            try {
                conn.close();
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
    }

    /**
     * 重写释放资源方法
     * @param statement
     * @param conn
     * @param rs
     */
    public static void close( Connection conn,Statement statement, ResultSet rs){
        if(statement != null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
