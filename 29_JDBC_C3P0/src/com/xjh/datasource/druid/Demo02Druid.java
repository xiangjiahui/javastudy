package com.xjh.datasource.druid;

import com.xjh.datasource.utils.DruidUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 *DruidUtils使用演示案例
 * 给连接的my数据库的account表添加一条数据
 */
public class Demo02Druid {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = DruidUtils.getConnection();
            String sql = "insert into account values(null,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1,"王五");
            ps.setDouble(2,3000);
            int i = ps.executeUpdate();
            System.out.println(i);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DruidUtils.close(conn,ps);
        }
    }
}
