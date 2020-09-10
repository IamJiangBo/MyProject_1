package reflect;

import java.lang.reflect.Field;

/**
 * @author: JiangBO
 * @date: 2020/9/8 9:10
 */

public class ReflectLearning1_Filed {
    /**
     Class对象功能：
         * 获取功能
         1. 获取成员变量们
             * Filed[] getFileds()：  获取所有public修饰的成员变量
             * Filed getFiled(String name)： 获取指定名称的public修饰的成员变量

             * Filed[] getDeclaredFileds()
             * Filed get DeclaredFiled(String name)

         2. 获取构造方法们：
             * Constructor<?>[] getConstructors()
             * Constructor<T> getConstructor(类<?>...parameterTypes)

             * Constructor<T> getDeclaredConstruct(类<?>...parameterTypes)
             * Constructor<T>[] getDeclaredConstructors()
         3. 获取成员方法们：
             * Method[] getMethods()
             * Method getMethod(String name, 类<?>...parameterTypes)

             * Method[] getDeclaredMethods()
             * Method getDeclaredMethod(String name, 类<?>...parameterTypes)
         4.获取类名
            * String getName()
     */
    public static void main(String[] args) throws Exception {

        //1.获取Person的class对象//ctrl + alt + v
        Class<Person> personClass = Person.class;
        //2.获取public成员变量
        Field[] fields_1 = personClass.getFields();
        for (Field filed: fields_1){
            System.out.println(filed);
        }

        System.out.println("—————————获取成员变量:1———————————");

        Field field_1 = personClass.getField("a");
        //获取成员变量a的值
        Person p = new Person();
        Object value_1 = field_1.get(p);
        System.out.println(value_1);

        //设置成员变量a的值
        field_1.set(p, "张三");
        System.out.println(p.toString());
        float[] data = {0.2f, 0.5f};
        System.out.println("—————————获取成员变量：2———————————");
        //获取所有成员变量，不考虑修饰符
        Field[] declaredFields = personClass.getDeclaredFields();
        for(Field declaredField: declaredFields){
            System.out.println(declaredField);
        }

        //尝试获取私有变量
        Field field_2 = personClass.getDeclaredField("d");
        //尝试获取私有变量的值：需要忽略访问权限的修饰符的安全检查（需要用到暴力反射）
        field_2.setAccessible(true);
        Object value_2 = field_2.get(p);
        System.out.println(value_2);
        //赋新值
        field_2.set(p, "王五");
        System.out.println(p.toString());

    }

}
