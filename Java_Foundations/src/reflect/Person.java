package reflect;

/**
 * @author: JiangBO
 * @date: 2020/9/8 9:14
 */

public class Person {
    private String name;
    private int age;

    public String a;
    protected String b;
    String c;
    private String d;

    public String demo;


    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                '}';
    }


    public void eat(){
        System.out.println("无参 eat方法...");
    }
    public void eat(String food){
        System.out.println("有参 eat方法...："+food);
    }
}
