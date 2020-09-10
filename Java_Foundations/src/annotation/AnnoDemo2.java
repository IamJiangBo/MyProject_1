package annotation;

/**
 * @auther: JiangBO
 * @date: 2020/9/6 22:12
 */

/**
 * 一、jdk预定义的一些注解
 * * @Override: 检测被该注解标注的方法是否是继承自父类（接口）的
 * * @Oeprecated: 该注解标注的内容，标识已过期
 * * @SuppressWarnings: 压制警告//一般传递参数all
 */

@SuppressWarnings("all")  //all表示压制所有警告
public class AnnoDemo2 {
    //如果不添加此注解，那么该方法就是该类所特有的
    @Override
    public String toString() {
        return super.toString();
    }
    @Deprecated
    public void show1(){
        //有缺陷
    }

    @MyAnno(age=20, name="zhangsan", per = Person.p1, show3 = @MyAnno2, strs={"1", "2"})
    public void show2(){
        //替代show1方法
    }

    public void demo(){
        show1();
    }
}
