package reflect;

/**
 * @author: JiangBO
 * @date: 2020/9/8 13:59
 */

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 框架的实现：
 * 不改变该类的任何代码。实现创建任意类的对象，执行任意方法。
 */
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        //1.加载配置文件
        //1.1创建Properties对象
        Properties pro = new Properties();
        //1.2获取class目录下的配置文件//通过当前类ReflectTest获取的
        ClassLoader classloader = ReflectTest.class.getClassLoader();
        InputStream input = classloader.getResourceAsStream("pro.properties");
        pro.load(input);

        //2.获取配置文件中定义的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        //3.加载该类进内存
        Class<?> aClass = Class.forName(className);
        //4.为加载进内存的类创建对象
        Object obj = aClass.newInstance();
        //5.获取该内存中类的方法
        Method method = aClass.getMethod(methodName);
        //6.执行方法(如果方法有参数，此处需要添加参数)
        method.invoke(obj);

    }


}
