package com.xjh.Test;


import com.xjh.Junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

//Junit:单元测试
public class CalculatorTest {

    /*
     初始化方法:用于资源申请,所有测试方法在执行之前都会先执行该方法
     */
    @Before
    public void init(){
        System.out.println("init......");
    }

    /*
    释放资源方法:在所有测试方法执行完之后，都会自动执行该方法
     */
    @After
    public void close(){
        System.out.println("close....");
    }

    @Test
    public void testAdd(){
        //1.创建对象
        Calculator c = new Calculator();
        //2.调用方法
        int result = c.add(1, 2);
        //3.断言
        //Assert.assertEquals(期望的值,实际运算的值),两值对比，相同则对通过测试，不同则错误，不通过测试
        Assert.assertEquals(3,result);
    }

    @Test
    public void testMultiply(){
        Calculator c = new Calculator();
        int m = c.multiply(12, 245);
        Assert.assertEquals(12*245,m);
    }

    @Test
    public void testDivision(){
        Calculator c = new Calculator();
        double result = c.division(1,2);
        //Assert.assertEquals(expected, actual, delta)delta代表精度值
        Assert.assertEquals(0.5,result,0.000);
    }
}
