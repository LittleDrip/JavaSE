package 特殊包装类;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Void v=null;
        /*
          其中第一个是用于计算超大数字的BigInteger，
          我们知道，即使是最大的long类型，也只能表示64bit的数据，
          无法表示一个非常大的数，但是BigInteger没有这些限制，我们可以让他等于一个非常大的数字：
         */
        BigInteger i=BigInteger.valueOf(100);//不支持自动装箱拆箱不能直接写i=10;
        //用对象的方法去调用

        /*
        ！！！注意：这里BigInteger的值i，是不可以修改的。包括Integer也一样，所以要赋到新的对象
        */
       BigInteger a= i.multiply(BigInteger.TEN);//i*10;
        /*
        * BigInteger a= i.add(BigInteger.TEN);//i*10;
        * BigInteger a= i.divide(BigInteger.TEN);//i/10;  只能是整数
        * BigInteger a= i.subtract(BigInteger.TEN);//i-10;
        * */
//        System.out.println(a);

    }
}
