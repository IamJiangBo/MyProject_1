package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @auther: JiangBO
 * @date: 2020/9/7 9:39
 */

//@MyAnno(age=20, name="shangsan", per = Person.p1, show3 = @MyAnno2, strs={"1", "2"})
@MyAnno3
public class Worker {
    public String name = "123";
    public int age;
    @MyAnno3
    public void show(){

    }
}
