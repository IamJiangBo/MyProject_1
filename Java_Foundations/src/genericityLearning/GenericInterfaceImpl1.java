package genericityLearning;

/**
 * @author: JiangBO
 * @date: 2020/9/8 20:12
 */

/**
 * 泛型接口的第一种实现方式
 *      实现接口的同时制定泛型的数据类型，并且重写泛型接口的方法
 */
public class GenericInterfaceImpl1 implements GenericInterface<String>{

    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
