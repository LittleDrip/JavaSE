package 基本类型包装类;

public class Main {
    public static void main(String[] args) {

//        Integer i=10;//i是对象
        //Integer i = Integer.valueOf(10);    //上面的写法跟这里是等价的
//        int a=i;
        //int a = i.intValue();               //通过此方法变成基本类型int值
//        String a="666";
//        Integer i=Integer.parseInt(a);
//        System.out.println( i*10 );

        Integer i = Integer.decode("0xA6");
        System.out.println(i);
        System.out.println("0x"+Integer.toHexString(10));

        Character c='A';

    }

}
