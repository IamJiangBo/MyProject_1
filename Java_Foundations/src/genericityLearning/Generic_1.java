package genericityLearning;

/**
 * @author: JiangBO
 * @date: 2020/9/8 16:34
 */
import java.util.ArrayList;
import java.util.Iterator;
public class Generic_1 {

    public static void main(String[] args) {
        //不使用泛型
        show1();

        //使用泛型
        show2();
    }

    /**
     * 创建集合对象，使用泛型。
     * 好处：
     *      1.避免了类型转换的麻烦，存储的是什么类型，取出的就是什么类型。
     *      2.把运行期异常（代码运行之后会抛出的异常），提升到了编译期（写代码的时候会报错）
     * 弊端：
     *      泛型是什么类型，只能存储什么类型的数据
     */
    private static void show2() {
        ArrayList<String> list = new ArrayList<>();
        //此时 只能添加字符串
        list.add("abc");

    }

    /**
     * 从集合说起：
     * 创建集合对象，不使用泛型
     * 好处：
     *      集合不使用泛型，默认的类型就是Object类型，可以存储任意类型的数据
     * 弊端：
     *      不安全，会引发异常
     */
    public static void show1(){
        ArrayList list = new ArrayList();
        list.add("12300");
        list.add(123);

        //使用迭代器遍历list集合
        //1.获取迭代器
        Iterator it = list.iterator();
        //2.使用迭代器中的方法hasNext和Next遍历集合
        while(it.hasNext()) {
            Object obj = it.next();  //获取迭代器中元素
            System.out.println(obj);

        }
    }
}
