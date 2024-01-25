package 泛型.函数式接口;



import java.security.PublicKey;
import java.util.function.Consumer;

public class Main {
    /*Consumer消费型函数式接口：*/

    //专门消费Student对象的Consumer
    private static final Consumer<Student> STUDENT_CONSUMER = student -> System.out.println(student + " 真好吃！");

    public static void main(String[] args) {
        Student student = new Student();
        STUDENT_CONSUMER
                .andThen(st-> System.out.println("对吧"))
                .accept(student);
    }

    public static class Student {
        public void hello() {
            System.out.println("我是学生！");
        }
    }
}