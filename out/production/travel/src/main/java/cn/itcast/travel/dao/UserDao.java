package cn.itcast.travel.dao;

import cn.itcast.travel.domain.User;

public interface UserDao {

    /**
     * 根据用户名查询用户信息是否存在
     * @param username
     * @return
     */
    public User findByUsername(String username);

    /**
     * 保存用户注册的信息
     * @param user
     */
    public void save(User user);
}
