package 泛型.函数式接口;

import java.util.function.Predicate;

public class Main4
{
    private static final Predicate<Student> STUDENT_PREDICATE = student -> student.score >= 60;
    public static void main(String[] args) {
        /*Student student = new Student();
        student.score = 80;
        if(STUDENT_PREDICATE.test(student)) {  //test方法的返回值是一个boolean结果
            System.out.println("及格了，真不错");
        } else {
            System.out.println("不是，Java都考不及格？隔壁初中生都在打ACM了");
        }*/
        Student student = new Student();
        student.score = 80;
        boolean b = STUDENT_PREDICATE
                .and(stu -> stu.score > 90)   //需要同时满足这里的条件，才能返回true
                .test(student);
        if(!b) System.out.println("Java到现在都没考到90分？你的室友都拿国家奖学金了");
    }
    public static class Student {
        public int score;
    }
}
