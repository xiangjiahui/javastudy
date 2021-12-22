package com.xjh.datasource.jdbctemplate;

import com.xjh.datasource.utils.DruidUtils;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Spring JDBC:Spring框架对JDBC的简单封装(封装成对象)，提供了一个JDBCTemplate对象简化JDBC的开发
 * JdbcTemplate入门
 * JDBCTemplate会使用完会自动归还连接对象和释放资源
 * update():执行DML增、删、改语句
 * queryForMap():查询结果并将结果集封装为Map集合,这个方法查询的结果集长度只能为1
 * queryForList():查询结果并将结果集封装为List集合
 * query(sql,new BeanPropertyRowMapper<Emp>(Emp.class)):查询结果，将结果封装为JavaBean对象
 * queryForObject(sql,Long.class):查询结果，将结果封装为对象,一般用来执行聚合函数
 */
public class Demo01JdbcTemplate {
    public static void main(String[] args) throws Exception {
//        Properties pro = new Properties();
//        InputStream is = Demo01Druid.class.getClassLoader().getResourceAsStream("druid.properties");
//        pro.load(is);
//        //获取连接池对象
//        DataSource ds = DruidDataSourceFactory.createDataSource(pro);
//        JdbcTemplate template = new JdbcTemplate(ds);
        //1.导入jar包
        //2.创建JDBCTemplate对象,依赖于数据源DataSource
        //需要传递一个DataSource对象，一般只传一个参数即可
        JdbcTemplate template = new JdbcTemplate(DruidUtils.getDataSource());
        String sql = "update account set balance = 5000 where id = ?";
        int count = template.update(sql, 3);
        System.out.println(count);
    }
}
