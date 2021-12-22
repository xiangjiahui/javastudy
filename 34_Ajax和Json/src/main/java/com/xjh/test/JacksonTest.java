package com.xjh.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xjh.domain.Person;
import org.junit.Test;

import java.util.Date;

/*
JSON数据和Java对象的相互转换

		* JSON解析器：
			* 常见的解析器：Jsonlib，Gson，fastjson，jackson

		1. JSON转为Java对象
			1. 导入jackson的相关jar包
			2. 创建Jackson核心对象 ObjectMapper
			3. 调用ObjectMapper的相关方法进行转换
				1. readValue(json字符串数据,Class)
		2. Java对象转换JSON
			1. 使用步骤：
				1. 导入jackson的相关jar包
				2. 创建Jackson核心对象 ObjectMapper
				3. 调用ObjectMapper的相关方法进行转换
					1. 转换方法：
						* writeValue(参数1，obj):
		                    参数1：
		                        File：将obj对象转换为JSON字符串，并保存到指定的文件中
		                        Writer：将obj对象转换为JSON字符串，并将json数据填充到字符输出流中
		                        OutputStream：将obj对象转换为JSON字符串，并将json数据填充到字节输出流中
		                * writeValueAsString(obj):将对象转为json字符串

					2. 注解：
						1. @JsonIgnore：排除属性。
						2. @JsonFormat：属性值得格式化
							* @JsonFormat(pattern = "yyyy-MM-dd")

					3. 复杂java对象转换
						1. List：数组
						2. Map：对象格式一致
 */
public class JacksonTest {

    @Test
    //java转json
    public void test1() throws Exception {
        Person p = new Person();
        p.setName("张三");
        p.setAge(23);
        p.setGender("男");
        p.setBirthday(new Date());

        //1.创建Jackson核心对象ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        //2.调用相关方法进行转换
        /*
        转换方法:
            1.writeValue(参数1,obj):
                参数1取值情况:
                    File:将obj对象转换为JSON字符串,并保存到指定的文件中
                    Writer:将obj对象转换为JSON字符串,并将json数据填充到字符输出流中
                    OutputStream:将obj对象转换为JSON字符串,并将json数据填充到字节输出流中
            2.writeValueAsString(obj):将对象转为json字符串
         */
        String json = mapper.writeValueAsString(p);
//        mapper.writeValue(new FileWriter("D://a.txt"),p);
        System.out.println(json);
    }

    //json转Java
    @Test
    public void test2() throws Exception {
        //1.创建json数据
        String json = "{\"name\":\"张三\",\"age\":23,\"gender\":\"男\"}";

        //2.创建ObjectMapper对象
        ObjectMapper mapper = new ObjectMapper();

        //3.调用readValue方法
        Person person = mapper.readValue(json, Person.class);
        System.out.println(person);
    }
}
