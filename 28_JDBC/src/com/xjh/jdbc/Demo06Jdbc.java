package com.xjh.jdbc;

import com.xjh.jdbcutil.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 事务操作
 */
@SuppressWarnings("all")
public class Demo06Jdbc {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps1 = null;
        PreparedStatement ps2 = null;
        try {
            conn = JDBCUtils.getConn();
            //开启事务
            conn.setAutoCommit(false);
            String sql1 = "update account set balance = balance - ? where id = ?";
            String sql2 = "update account set balance = balance + ? where id = ?";
            ps1 = conn.prepareStatement(sql1);
            ps2 = conn.prepareStatement(sql2);

            ps1.setDouble(1,500);
            ps1.setInt(2,1);

            ps2.setDouble(1,500);
            ps2.setInt(2,2);

            ps1.executeUpdate();
//            int i = 3/0;
            ps2.executeUpdate();

            conn.commit();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                if(conn != null){
                    conn.rollback();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }finally {
            JDBCUtils.close(conn,ps1);
            JDBCUtils.close(null,ps2);
        }
    }
}
