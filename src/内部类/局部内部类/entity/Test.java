package 内部类.局部内部类.entity;

public class Test {
    private final String name;

    public Test(String name) {
        this.name=name;
    }
    public void test(){
        class Inner{
            String str;
        }
        Inner inner=new Inner();//既然是在方法中声明的类，那作用范围也就只能在方法中了：
    }



    }

