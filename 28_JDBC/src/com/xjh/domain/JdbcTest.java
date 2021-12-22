package com.xjh.domain;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/*
  练习：定义一个方法，查询emp表的数据将其封装为对象，然后装载集合，返回
 */
@SuppressWarnings("all")
public class JdbcTest {
    public static void main(String[] args) {
        List<Emp> list = new JdbcTest().selectAll();
        for (Emp emp : list) {
            System.out.println(emp);
        }
//        list.stream().forEach((list01)->{
//            System.out.println(list01);
//        });
    }

    /**
     * 查询所有emp对象
     * @return
     */
    public List<Emp> selectAll(){
        Connection conn = null;
        Statement statement = null;
        ResultSet res = null;
        List<Emp> list = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///my","root","root");
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
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
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
            if(res != null){
                try {
                    res.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }
}
