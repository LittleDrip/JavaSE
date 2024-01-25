package 特殊包装类;
import java.math.BigInteger;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BigInteger i =BigInteger.valueOf(Long.MAX_VALUE);
//        BigInteger b=sc.nextBigInteger();//字符串类型的可以接受很长很长
         BigInteger a=i.multiply(BigInteger.valueOf(Long.MAX_VALUE));
        /*
        * Long的最大值乘以Long的最大值
        * Long类型会溢出
        * 但是BigInteger不会*/
        System.out.println(Long.MAX_VALUE*Long.MAX_VALUE);
        System.out.println(a);
        BigInteger c=i.pow(100);
//        天文数字
        System.out.println(c);
    }
}
