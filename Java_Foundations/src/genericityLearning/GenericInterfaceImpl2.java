package genericityLearning;

/**
 * @author: JiangBO
 * @date: 2020/9/8 20:28
 */

/**
 * 泛型的第二种实现方式
 *      接口使用什么泛型，实现类就是用什么泛型，类跟着接口走
 *      就相当于定义了一个含有泛型的类，创建对象的时候确定泛型的类型
 */
public class GenericInterfaceImpl2<I> implements GenericInterface<I>{
    @Override
    public void method(I i) {
        System.out.println(i);
    }
}
