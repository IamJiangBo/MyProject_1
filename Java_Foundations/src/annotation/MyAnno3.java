package annotation;

import java.lang.annotation.*;

/**
 * @auther: JiangBO
 * @date: 2020/9/7 9:34
 */
@Target(value={ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})   //数组性注解的写法
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyAnno3 {
}
