package genericityLearning;

/**
 * @author: JiangBO
 * @date: 2020/9/8 19:45
 */

public class Generic_method_Demo {
    public static void main(String[] args) {
        Generic_method gm = new Generic_method();
        gm.method_1("abc");
        gm.method_1(123);
        gm.method_1(2.3);
        gm.method_1(true);


        gm.method_2("静态方法，不建议创建对象调用");
        Generic_method.method_2("类调用静态方法");
        Generic_method.method_2(2.22);
    }
}
