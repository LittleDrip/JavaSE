package 接口.entity;

public class Test implements C {
    public void test(){
        System.out.println("我是Test的实现");
    }

    @Override
    public void hello() {
        System.out.println("hello");
    }
}
