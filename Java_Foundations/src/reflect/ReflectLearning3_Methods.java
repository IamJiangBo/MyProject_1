package reflect;

/**
 * @author: JiangBO
 * @date: 2020/9/8 12:41
 */

import java.lang.reflect.Method;

/**
 * 3. 获取成员方法们：
     * Method[] getMethods()
     * Method getMethod(String name, 类<?>...parameterTypes)
     * Method[] getDeclaredMethods()
     * Method getDeclaredMethod(String name, 类<?>...parameterTypes)
 */
public class ReflectLearning3_Methods {
    public static void main(String[] args) throws Exception {
        //创建反射对象（Class对象）
        Class<Person> personClass = Person.class;
        //获取指定名称的方法(无参方法)
        Person person = new Person();

        System.out.println("————单一方法获取————");
        Method eat = personClass.getDeclaredMethod("eat");
        //由于方法没有参数，所以传对象即可
        eat.invoke(person);

        //获取指定名称的方法(有参方法)
        Method eat2 = personClass.getDeclaredMethod("eat", String.class);
        eat2.invoke(person, "apple");

        System.out.println("—————获取所有方法—————");
        //该方法不经可以获取当前类的方法，还可以获取该类所有父类的方法。
        Method[] methods = personClass.getMethods();
        for(Method method: methods){
            method.setAccessible(true);  //支持暴力反射
            System.out.println(method);
            System.out.println(method.getName());
        }

    }
}
