package com.xjh.redis;

import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * jedis的测试类
 * 1.String数据结构操作
 *          set(key,value) / get()
 * 2.hash数据结构操作:相当于map集合
 *          hset(key,field,value) / hget() / hgetAll()
 * 3.list数据结构操作:无序可重复
 *          lpush(key,value) / rpush() :从左边/右边添加数据
 *          lpop() / rpop() :从左边/右边弹出数据
 *          lrange(key,start(0),end(-1)):获得数据
 * 4.set数据结构操作:无序不可重复
 *          sadd(key,value) / smembers()
 *          srem(key,value...):可删除多个value值
 * 5.sortedset数据结构操作
 *          zadd(key,value) / zrange(key,start(0),end(-1))
 *          zrem(key,value...):可删除多个value值
 */
public class JedisTest {

    //操作string数据结构
    @Test
    public void test1(){
        //1.获取连接
        Jedis jedis = new Jedis("localhost",6379);
        //2.操作
        jedis.set("username", "zhangsan");
        String username = jedis.get("username");
        //setex()存储指定过期事件的key value值
        jedis.setex("activecode",20,"激活码过期了");
        //3.关闭连接
        jedis.close();
    }

    //操作hash数据结构
    @Test
    public void test2(){
        Jedis jedis = new Jedis();

        jedis.hset("user","name","lisi");
        jedis.hset("user","age","23");
        jedis.hset("user","gender","male");

        Map<String, String> user = jedis.hgetAll("user");
/*        Set<Map.Entry<String, String>> entries = user.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry);
        }*/
        Set<String> set = user.keySet();
        for (String key : set) {
            String value = user.get(key);
            System.out.println(key + ":" + value);
        }
        jedis.close();
    }

    //操作list数据结构
    @Test
    public void test3(){
        Jedis jedis = new Jedis();

        jedis.lpush("mylist","a","b","c");//从左边存,先存的在里面
        jedis.rpush("mylist","a","b","c");//从右边存

        List<String> mylist = jedis.lrange("mylist", 0, -1);

        //弹出,也是删除
        jedis.lpop("mylist");//删除最左边的元素,并将元素返回
        jedis.rpop("mylist");//删除最右边的元素,并将元素返回
/*        for (int i = 0; i < mylist.size(); i++) {
            String s = jedis.lpop("mylist");
            System.out.println("第"+i+"次弹出的是:"+s);
        }*/

        jedis.close();
    }

    //操作set数据结构
    @Test
    public void test4(){
        Jedis jedis = new Jedis();

        jedis.sadd("myset","c++","java","php");

        Set<String> myset = jedis.smembers("myset");
        jedis.srem("myset","c++");//可以删除多个数据
        System.out.println(myset);

        jedis.close();
    }

    //操作sortedset数据结构
    @Test
    public void test5(){
        Jedis jedis = new Jedis();

        //参数score就是用于value进行排序,从小到大排序
        jedis.zadd("mysorted",2,"亚瑟王");
        jedis.zadd("mysorted",1,"后裔");
        jedis.zadd("mysorted",5,"孙悟空");

        Set<String> mysorted = jedis.zrange("mysorted", 0, -1);

        System.out.println(mysorted);

        jedis.close();
    }

}
