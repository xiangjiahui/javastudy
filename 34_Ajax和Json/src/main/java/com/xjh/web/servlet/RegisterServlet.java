package com.xjh.web.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        //获取参数
        String username = req.getParameter("username");

        //这里简化数据库查询操作,直接将数据保存到map集合中
        Map<String,Object> map = new HashMap<String,Object>();
        if ("zhangsan".equals(username)){
            //用户名存在
            map.put("userExsit",true);
            map.put("msg","此用户名已存在,请更换用户名");
        }else {
            //用户名不存在
            map.put("userExsit",false);
            map.put("msg","用户名可用");
        }
        //将map转为json,并发送给客户端
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(resp.getWriter(),map);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
