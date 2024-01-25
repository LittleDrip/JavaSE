package 内部类.静态内部类.entity;

public class Test {
    private final String name;

    public Test(String name) {
        this.name = name;
        System.out.println(Inner.str);//这里能成功访问是因为，Test,Inner都是静态类，同时str也是静态变量
    }

    //静态内部类
    public static class Inner {
        static String str;

        public void test() {
//            System.out.println(name);//无法从 static 上下文引用非 static 字段 'name'
            System.out.println(str);

        }
    }
}