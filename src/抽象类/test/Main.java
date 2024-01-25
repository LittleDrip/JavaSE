package 抽象类.test;

import 抽象类.test.entity.Person;
import 抽象类.test.entity.Student;
import 抽象类.test.entity.Study;
import 抽象类.test.entity.Worker;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        //抽象类由于不是具体的类定义（它是类的抽象）可能会存在某些方法没有实现
        // 因此无法直接通过new关键字来直接创建对象：
//        Person person=new Student("小米",12,"男");
//        Person person1=new Worker("小网",12,"男");
//        person1.exam();
//        person.exam();
//        Study.test1();
        Student s1=new Student("小米",12,"男");
        Student s2= (Student) s1.clone();
        System.out.println(s1.equals(s2));
        System.out.println(s1);
        System.out.println(s2);

    }
}
