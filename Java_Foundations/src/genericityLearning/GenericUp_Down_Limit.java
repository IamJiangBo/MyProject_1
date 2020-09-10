package genericityLearning;

/**
 * @author: JiangBO
 * @date: 2020/9/8 20:59
 */

import java.util.Collection;
import java.util.ArrayList;
/**
 * 泛型的上限限定：? extends E 代表使用的泛型只能是E类型的子类/本身
 * 泛型的下限限定：? super E 代表使用泛型只能是E类型的父类/本身
 */


public class GenericUp_Down_Limit {
    public static void main(String[] args) {
        Collection<Integer> list1 = new ArrayList<Integer>();
        Collection<String> list2 = new ArrayList<String>();
        Collection<Number> list3 = new ArrayList<Number>();
        Collection<Object> list4 = new ArrayList<Object>();

        getElement1(list1);
//        getElement1(list2);  //报错；因为String不是Number的子类
        getElement1(list3);
//        getElement1(list4);  //报错： 因为Object不是Number的子类

//        getElement2(list1);  //报错；因为Integer不是Number的父类
//        getElement2(list2);  //报错：因为String不是Number的父类
        getElement2(list3);
        getElement2(list4);

    }

    //泛型的上限：此时的泛型？ 必须是Number类型或者Number类型的子类
    public static void getElement1(Collection<? extends Number> coll){}
    //泛型的下限：此时的泛型？，必须是Number类型或者Number类型的父类
    public static void getElement2(Collection<? super Number> coll){}
}
