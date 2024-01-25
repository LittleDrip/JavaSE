package 内部类.成员内部类.entity;

public class Test {
    private final String name;

    public Test(String name) {
//        System.out.println(str); --->报错： 无法解析符号 'str'
        this.name=name;
    }



    //成员内部类
    public class Inner{
       /* String str;

       public void test(){
           System.out.println("我是内部类"+name);//成员内部类可以访问到外部的成员变量
           //因为成员内部类本身就是某个对象所有的，每个对象都有这样的一个类定义，这里的name是其所依附对象的
           */
       String name;
        public void test(String name){
            System.out.println("方法参数的name = "+name);    //依然是就近原则，最近的是参数，那就是参数了
            System.out.println("成员内部类的name = "+this.name);   //在内部类中使用this关键字，只能表示内部类对象
            System.out.println("成员内部类的name = "+Test.this.name);
            //如果需要指定为外部的对象，那么需要在前面添加外部类型名称
       }
    }
}
