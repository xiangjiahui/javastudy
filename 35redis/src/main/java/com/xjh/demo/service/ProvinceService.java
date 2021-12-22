package com.xjh.demo.service;

import com.xjh.demo.domain.Province;

import java.util.List;

public interface ProvinceService {

    public List<Province> findAll();

    public String findAllJson();
}
