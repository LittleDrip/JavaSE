package 泛型.函数式接口;

import java.util.function.Supplier;

public class Main2 {
  private static final Supplier<Student> STUDENT_SUPPLIER=Student::new; //方法引用
     public static void main(String[] args) {

        /*Supplier供给型函数式接口*/

        Student student=STUDENT_SUPPLIER.get();
        student.hello();
    }
    public static class Student {
        public void hello(){
            System.out.println("我是学生！");
        }
    }
}

