package 内部类.成员内部类;

import 内部类.成员内部类.entity.Test;

public class Main {
    public static void main(String[] args) {
       Test a=new Test("小红");
       Test.Inner inner=a.new Inner();
       inner.test("小王");






    }
}
