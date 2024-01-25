package 内部类.匿名内部类;

import 内部类.匿名内部类.entity.Student;
import 内部类.匿名内部类.entity.Study;
import 内部类.匿名内部类.entity.Test;

public class Main {

    public static void main(String[] args) {
          /*正常情况下，要创建一个抽象类的实例对象，只能对其进行继承，先实现未实现的方法，然后创建子类对象。
        而我们可以在方法中使用匿名内部类，将其中的抽象方法实现，并直接创建实例对象：*/
        Student student=new Student() {
            //相当于花括号里面就相当于一个子类
            String a;
            void xxx(){

            }
            @Override
            public void test() {
                System.out.println("我是匿名内部类"+name);
            }
        };
            student.test();

            //接口也是一样
        Study study=new Study() {
            @Override
            public void study() {
                System.out.println("我是接口study");
            }
        };
        study.study();

        //当然，并不是说只有抽象类和接口才可以像这样创建匿名内部类，普通的类也可以
        Test test=new Test(){
            {
                test();
            }
            void test(){
                System.out.println("方法执行");
                name="我是匿名内部类初始化的变量";
            }
        };
        System.out.println(test.getName());
    }
}
