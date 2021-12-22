package cn.itcast.travel.test;

import cn.itcast.travel.domain.User;
import cn.itcast.travel.util.JDBCUtils;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserTest {
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
    @Test
    public void test(){
        String sql = "select * from tab_user where username = ?";
        User user = template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class));

    }
}
