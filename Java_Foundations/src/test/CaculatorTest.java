package test;

/**
 * @author: JiangBO
 * @date: 2020/9/7 13:05
 */

import JUnitLearning.Caculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;

/**
 * 测试add方法
 */
public class CaculatorTest {

    @Before
    public void init(){
        //初始化方法
        //用于申请资源，在所有单元测试方法执行前都会执行此方法
        System.out.println("init...");
    }
    @After
    public void close(){
        //释放资源方法，
        //所有测试方法执行完之后，都会自动执行该方法
        System.out.println("close...");
    }

    @Test
    public void testAdd(){
        //1.创建计算器对象
        Caculator ca = new Caculator();
        //2.调用add方法
        int result = ca.sub(2, 3);
        //单元测试中一般不用输出，而是使用断言
        //System.out.println(result);
        //3.断言输出结果
        Assert.assertEquals(3, result);

    }

    @Test
    public void testSub(){
        Caculator cal = new Caculator();
        int result2 = cal.sub(6, 2);
        Assert.assertEquals(4, result2);
    }

}
