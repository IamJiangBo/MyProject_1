package genericityLearning;

/**
 * @author: JiangBO
 * @date: 2020/9/8 19:21
 */

public class Generic_3 {
    public static void main(String[] args) {

        //对于泛型类 创建对象时，如果不指定数据类型，默认为Object类型
        Generic_2 generic = new Generic_2();
        generic.setName("字符串");
        System.out.println(generic.getName());

        //创建Generic_2对象。泛型使用Integer类型
        Generic_2<Integer> generic2 = new Generic_2<>();
        generic2.setName(2333);
        System.out.println(generic2.getName());
    }
}
