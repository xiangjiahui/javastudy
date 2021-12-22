package com.xjh.demo.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xjh.demo.dao.ProvinceDao;
import com.xjh.demo.dao.impl.ProvinceDaoImpl;
import com.xjh.demo.domain.Province;
import com.xjh.demo.service.ProvinceService;
import com.xjh.utils.JedisPoolUtils;
import redis.clients.jedis.Jedis;

import java.util.List;

public class ProvinceServiceImpl implements ProvinceService {
    //声明dao
    private ProvinceDao dao = new ProvinceDaoImpl();

    @Override
    public List<Province> findAll() {
        return dao.findAll();
    }

    @Override
    public String findAllJson() {
        //1.先从redis中查询数据
        //1.1先获得jedis连接
        Jedis jedis = JedisPoolUtils.getJedis();
        String province_json = jedis.get("province");

        //2.先判断province_json是否有数据
        if (province_json == null || province_json.length() == 0){
            //2.1redis中没有数据就先从数据库中查询
            List<Province> province_list = dao.findAll();
            //2.2将list集合序列化为json
            ObjectMapper mapper = new ObjectMapper();
            try {
                province_json = mapper.writeValueAsString(province_list);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }

            //2.3将json数据存入redis,进行缓存,这样下一次查询不是查询数据库而是redis
            jedis.set("province",province_json);

            //关闭jedis
            jedis.close();
        }
        return province_json;
    }
}
