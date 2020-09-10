package reflect;

/**
 * @author: JiangBO
 * @date: 2020/9/8 15:35
 */

public class ReflectLearning_getClass {
    /**
     *获取Class对象的方式：
     *   1. Class.forName("全类名")： 将字节码文件夹加载进内存，返回Class
     *   2.类名.class: 通过类名的属性class获取
     *   3.对象.getClass():在Object类中定义的
     */
    public static void main(String[] args) throws Exception {
        //1.Class.forName("全类名")
        Class cls_1 = Class.forName("reflect.Person");
        System.out.println(cls_1);

        //2.类名.class
        Class cls_2 = Person.class;
        System.out.println(cls_2);

        //3.对象.getClass()
        Person person = new Person();
        Class cls_3 = person.getClass();
        System.out.println(cls_3);

        //比较三个引用是否相等(==比较的是内存地址)
        System.out.println(cls_1 == cls_2);
        System.out.println(cls_1 == cls_3);

    }
}
