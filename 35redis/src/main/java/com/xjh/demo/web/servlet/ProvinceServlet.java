package com.xjh.demo.web.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xjh.demo.domain.Province;
import com.xjh.demo.service.ProvinceService;
import com.xjh.demo.service.impl.ProvinceServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/provinceServlet")
public class ProvinceServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.调用service查询结果
        ProvinceService service = new ProvinceServiceImpl();
        List<Province> list = service.findAll();

        //2.将数据序列化为json
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(list);

/*
        ProvinceService service = new ProvinceServiceImpl();
        String json = service.findAllJson();
*/

        //3.响应结果
        resp.setContentType("application/json;charset=utf-8");
        resp.getWriter().write(json);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
