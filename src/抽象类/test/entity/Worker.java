package 抽象类.test.entity;

public class Worker extends Person implements Study{

    public Worker(String name, int age, String sex) {
        super(name, age, sex);
    }
    @Override
    public void exam(){
        System.out.println("我是工人"+name+" 我不擅长学习，我只能拿D");
    }

    @Override
    public void study() {
        System.out.println("我比较一般");
    }
}
