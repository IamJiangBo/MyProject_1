package genericityLearning;

/**
 * @author: JiangBO
 * @date: 2020/9/8 19:16
 */

/**
 * 自己定义泛型
 * 定义一个含有泛型的类，模拟ArrayList集合
 * 泛型是一个位置的数据类型，当我们不确定使用什么数据类型时，可以使用泛型
 * 反省可以接受任意的数据类型，可以使用Integer, String， Student...
 * 创建对象的时候确定泛型的数据类型
 */
public class Generic_2<E> {

    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
