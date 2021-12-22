package com.xjh.demo.dao.impl;

import com.xjh.demo.dao.ProvinceDao;
import com.xjh.demo.domain.Province;
import com.xjh.utils.DruidUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
//操作数据库的实现类
public class ProvinceDaoImpl implements ProvinceDao {

    private JdbcTemplate template = new JdbcTemplate(DruidUtils.getDataSource());
    @Override
    public List<Province> findAll() {
        String sql = "select * from province";

        List<Province> list = template.query(sql, new BeanPropertyRowMapper<Province>(Province.class));

        return list;
    }
}
