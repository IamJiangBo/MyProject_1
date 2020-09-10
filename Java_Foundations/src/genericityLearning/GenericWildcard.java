package genericityLearning;

/**
 * @author: JiangBO
 * @date: 2020/9/8 20:36
 */

import java.util.ArrayList;
import java.util.Iterator;
/**
 * 泛型通配符：
 *      ？：代表任意的数据类型
 *  使用方式
 *      不能创建对象使用
 *      只能作为方法的参数使用
 */
public class GenericWildcard {
    public static void main(String[] args) {
        //定义整型集合
        ArrayList<Integer> list_1 = new ArrayList<>();
        list_1.add(123);
        list_1.add(456);

        //定义字符串型集合
        ArrayList<String> list_2 = new ArrayList<>();
        list_2.add("字符串1");
        list_2.add("字符串2");

        printArray(list_1);
        printArray(list_2);
    }

    /**
     * 定义一个方法，能遍历所有类型的ArrayList集合
     * 这时候我们并不知道ArrayList集合使用什么数据类型，可以使用泛型的通配符?来接收数据类型
     * 注意：
     *  泛型没有继承的概念，所以该方法的参数不能是Object
     */
    public static void printArray(ArrayList<?> list){
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}
