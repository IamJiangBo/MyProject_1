package annotation;

/**
 * @auther: JiangBO
 * @date: 2020/9/6 22:23
 */

public @interface MyAnno {
    int age();
    String name() default "张三";
    Person per();
    MyAnno2 show3();
    String[] strs();
}
