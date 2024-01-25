package 枚举类;

import 枚举类.entity.Status;
import 枚举类.entity.Student;

public class Main {
    public static void main(String[] args) {
        Student student=new Student();
      /*  student.setStatus(Status.RUNNING);
        System.out.println(student.getStatus());
        Status status=Status.valueOf("RUNNING");
        System.out.println(status);*/
        student.setStatus(Status.RUNNING);
        System.out.println(student.getStatus().getName());
    }
}
