package 接口.entity;

//接口的继承

//!!!!!可以多继承
//public interface A extends B ,C{
//    boolean equals(Object object);
//
//}
public interface A {
    default void test(){
        System.out.println("我是接口中的默认实现");
    }

}