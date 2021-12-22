package com.xjh.jdbcutil;

import com.xjh.domain.Emp;
import com.xjh.domain.JdbcTest;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@SuppressWarnings("all")
public class Jdbc {
    public static void main(String[] args) {
        List<Emp> list = new JdbcTest().selectAll();
        for (Emp emp : list) {
            System.out.println(emp);
        }
    }

    /**
     * JDBCUtils演示
     * @return
     */
    public List<Emp> selectAll(){
        Connection conn = null;
        Statement statement = null;
        ResultSet res = null;
        List<Emp> list = null;
        try {
            conn = JDBCUtils.getConn();
            statement = conn.createStatement();
            String sql = "select * from emp";
            res = statement.executeQuery(sql);
            Emp emp = null;
            list = new ArrayList<Emp>();
            while (res.next()){
                int id = res.getInt("id");
                String name = res.getString("name");
                String gender = res.getString("gender");
                double salary = res.getDouble("salary");
                Date join_time = res.getDate("join_time");
                int dept_id = res.getInt("dept_id");
                //创建emp对象，并赋值
                emp = new Emp();
                emp.setId(id);
                emp.setName(name);
                emp.setGender(gender);
                emp.setSalary(salary);
                emp.setJoin_time(join_time);
                emp.setDept_id(dept_id);
                list.add(emp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        JDBCUtils.close(conn,statement,res);
        return list;
    }
}
