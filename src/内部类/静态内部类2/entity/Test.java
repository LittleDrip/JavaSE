package 内部类.静态内部类2.entity;

public class Test {
    public static String test="";

    static {
        System.out.println("外部类初始化");
    }
    public static class Inner{
        static {
            System.out.println("内部类初始化");
        }
        public static void test(){
            System.out.println("我是内部类方法");
        }
    }

    }

