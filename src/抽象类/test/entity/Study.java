package 抽象类.test.entity;

public interface Study {
    // public static final int a=10;
    int a = 10;
    static void test1(){
        System.out.println("test1");
    }

    void study();
    default void test(){
        System.out.println("这是一个测试");
    }

}
