package genericityLearning;

/**
 * @author: JiangBO
 * @date: 2020/9/8 20:16
 */

public class GenericInterfaceImpl_Demo {
    public static void main(String[] args) {
        //创建GenericInterfaceImpl1对象
        GenericInterfaceImpl1 gi_1 = new GenericInterfaceImpl1();
        gi_1.method("字符串...");

        //创建GenericInterfaceImpl2对象
        GenericInterfaceImpl2<Integer> gi_2 = new GenericInterfaceImpl2();
        gi_2.method(123);
    }
}
