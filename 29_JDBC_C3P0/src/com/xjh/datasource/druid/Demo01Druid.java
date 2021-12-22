package com.xjh.datasource.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * Druid连接数据库演示
 * Druid由阿里开发，是世界上连接最快之一
 */
public class Demo01Druid {
    public static void main(String[] args) throws Exception {
        //1.导入jar包
        //2.定义配置文件druid.properties
        //3.加载配置文件
        Properties pro = new Properties();
        InputStream is = Demo01Druid.class.getClassLoader().getResourceAsStream("druid.properties");
        pro.load(is);
        //4.获取连接池对象
        DataSource ds = DruidDataSourceFactory.createDataSource(pro);
        //5.通过连接池获取连接对象
        Connection conn = ds.getConnection();
        System.out.println(conn);
    }
}
