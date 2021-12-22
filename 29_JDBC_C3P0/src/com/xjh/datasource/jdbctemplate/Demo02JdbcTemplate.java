package com.xjh.datasource.jdbctemplate;

import com.xjh.datasource.utils.DruidUtils;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class Demo02JdbcTemplate {

    private JdbcTemplate template = new JdbcTemplate(DruidUtils.getDataSource());

    //Junit单元测试，可以让方法独立执行。方法都是void无返回值,且是public修饰

    /**
     * 1.修改1号数据salary为10000
     */
    @Test
    public void test1() {
        String sql = "update emp set salary = 10000 where id = 1";
        int count = template.update(sql);
        System.out.println(count);
    }

    /**
     * 2.添加一条数据
     */
    @Test
    public void test2() {
        String sql = "insert into emp(id,name,salary) values(?,?,?)";
        template.update(sql, null, "郭靖", 1000);
    }

    /**
     * 3.删除上一条添加的数据
     */
    @Test
    public void test3() {
        String sql = "delete from emp where id = ?";
        template.update(sql, 7);
    }

    /**
     * 4.查询id为1的记录，将其封装为map集合
     * 这个方法查询的结果集长度只能为1
     */
    @Test
    public void test4() {
        String sql = "select * from emp where id = ?";
        Map<String, Object> map = template.queryForMap(sql, 1);
        System.out.println(map);
    }

    /**
     * 5.查询所有记录，将其封装为List集合
     */
    @Test
    public void test5() {
        String sql = "select * from emp";
        List<Map<String, Object>> list = template.queryForList(sql);
        for (Map<String, Object> stringObjectMap : list) {
            System.out.println(stringObjectMap);
        }
    }

    /**
     * 6.查询所有记录，将其封装为Emp对象的List集合
     */
    @Test
    public void test6() {
        String sql = "select * from emp";
        List<Emp> list = template.query(sql, new BeanPropertyRowMapper<Emp>(Emp.class));
        for (Emp emp : list) {
            System.out.println(emp);
        }
    }

    /**
     * 7.查询总记录数
     */
    @Test
    public void test7(){
        String sql = "select count(id) from emp";
        Long count = template.queryForObject(sql, Long.class);
        System.out.println(count);
    }
}