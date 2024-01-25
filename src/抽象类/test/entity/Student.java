package 抽象类.test.entity;

/*
 * 子类在构造时，不仅要初始化子类的属性，还需要初始化父类的属性
 * 所以说在默认情况下，子类其实是调用了父类的构造方法的
 * 只是在无参的情况下可以省略，但是现在父类构造方法需要参数，那么我们就需要手动指定了：
 */
public class Student extends Person implements Study,Cloneable{

    public Student(String name, int age, String sex) {
        super(name, age, sex);
    }
/*
* 1. 被复制的类需要实现Clonenable接口（不实现的话在调用clone方法会抛出CloneNotSupportedException异常),该接口为标记接口(不含任何方法)
* 2. 覆盖clone()方法，访问修饰符设为public。方法中调用super.clone()方法得到需要的复制对象。（native为本地方法)*/
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void exam() {
        System.out.println("我是小镇做题家"+name+" 我拿A随随便便");
    }

    @Override
    public void study() {
        System.out.println("我学习很厉害");
    }

    @Override
    public void test() {
        System.out.println("修改测试");
    }
}
