package 泛型.判空包装;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String str=null;
//       test(str);
//        test3(str);
        test4(str);
    }
    private static void test(String str){
        Optional
                .ofNullable(str)   //将传入的对象包装进Optional中
                .ifPresent(s -> System.out.println("字符串长度为："+s.length()));
        //如果不为空，则执行这里的Consumer实现
    }
    private static void test2(String str){
//        String s = Optional.ofNullable(str).get();   //get方法可以获取被包装的对象引用，但是如果为空的话，会抛出异常
//        String s2 = Optional.ofNullable(str).orElse("备选方案");
        String s3=Optional.ofNullable(str).orElseGet(()->{
            return "备选方案";
        });
        System.out.println(s3);
    }
    private static void test3(String str)
    {
        Integer i=Optional.ofNullable(str).map(String::length).get();
        System.out.println(i);
    }
    private static void test4(String str){
        String i= Optional.ofNullable(str).orElseThrow(NullPointerException::new);
        System.out.println(i);
    }
}
