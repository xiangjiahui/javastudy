package com.xjh.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisPool;
/**
 * jedis连接池的使用
 */
public class JedisPoolUse {
    public static void main(String[] args) {
        //1.创建一个连接池配置对象
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(50);//最大连接数
        config.setMaxIdle(10);//最大空闲连接数

        //2.创建jedis连接池对象
        JedisPool jedisPool = new JedisPool(config,"localhost",6379);
        //3.获取连接
        Jedis jedis = jedisPool.getResource();
        //4.使用
        jedis.set("hehe","heihei");
        //5.关闭
        jedis.close();


    }
}
