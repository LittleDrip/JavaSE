package 泛型;

import 泛型.entity.Test;

public class Main2 {
    //不只是类，包括接口、抽象类，都是可以支持泛型的：
    public static void main(String[] args) {
        A<String> a=new A<>();
        a.test();
    }
    static class A<T> implements Test<T>{

        @Override
        public T test() {
            return null;
        }
    }
}
