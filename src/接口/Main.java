package 接口;

import 接口.entity.C;
import 接口.entity.Test;
import 接口.entity.Test2;

public class Main {
    public static void main(String[] args) {
        Test2 t=new Test2();
        t.test();//接口有test(),父类也有test(),优先用父类方法
        //类 > 接口
      C c=new Test(); //这里可以接口，之后初始化用其实现类
      c.hello();

    }
}
