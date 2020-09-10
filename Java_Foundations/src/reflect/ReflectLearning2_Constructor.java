package reflect;


import java.lang.reflect.Constructor;

/**
 * @author: JiangBO
 * @date: 2020/9/8 10:45
 */

public class ReflectLearning2_Constructor {

    /**
     * 2. 获取构造方法们：
        * Constructor<?>[] getConstructors()
        * Constructor<T> getConstructor(类<?>...parameterTypes)
        * Constructor<T> getDeclaredConstruct(类<?>...parameterTypes)
        * Constructor<T>[] getDeclaredConstructors(
     */

    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;
        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);
        //构造器使用有参构造方法创建对象
        Person person = constructor.newInstance("张三", 25);
        System.out.println(person);

        System.out.println("———————使用空参构造方法—————————");
        Constructor<Person> constructor1 = personClass.getConstructor();
        Person person1 = constructor1.newInstance();
        System.out.println(person1);

        System.out.println("—————常规的空参构造直接使用Class中的newInstance()方法——");
        Person person3 = personClass.newInstance();
        System.out.println(person3);



    }


}
