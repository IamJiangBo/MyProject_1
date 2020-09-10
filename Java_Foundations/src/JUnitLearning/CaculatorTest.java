package JUnitLearning;

import java.sql.SQLOutput;

/**
 * @author: JiangBO
 * @date: 2020/9/7 12:42
 */

/**
 * 传统测试的局限性：
 * 1.测试代码和被测试代码得放在一块，不方便管理
 * 2.功能的单独测试
 */
public class CaculatorTest {
    public static void main(String[] args) {
        //创建对象
        Caculator ca = new Caculator();
        /*//调用
        int result = ca.add(2, 1);
        System.out.println(result);*/

        int result = ca.sub(6, 1);
        System.out.println(result);
    }
}
