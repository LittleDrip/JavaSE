package 内部类.静态内部类2;

import 内部类.静态内部类2.entity.Test;

public class Main {
    public static void main(String[] args) {
      Test.Inner.test();///内部类初始化  我是内部类方法
        //只用明确用外部类，才会初始化
        System.out.println(Test.test);
        /*内部类初始化
        我是内部类方法
        外部类初始化
        */
    }
}
