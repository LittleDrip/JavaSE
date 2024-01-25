package 工具类.数学工具类;

import java.util.Random;

public class Main{
    public static void main(String[] args) {
        System.out.println(Math.pow(5,7));//在java.lang包里不用手动导入;
        System.out.println(Math.pow(5,-2));
        System.out.println(Math.abs(-10));
        System.out.println(Math.max(10, 2.3));
        System.out.println(Math.sqrt(5));

//---------------------------------------------------------------------------
        //三角函数肯定也是安排上了的：

        Math.sin(Math.PI / 2);     //求π/2的正弦值，这里我们可以使用预置的PI进行计算
        Math.cos(Math.PI);       //求π的余弦值
        Math.tan(Math.PI / 4);    //求π/4的正切值

        Math.asin(1);     //三角函数的反函数也是有的，这里是求arcsin1的值
        Math.acos(1);
        Math.atan(0);
//---------------------------------------------------------------------------
        Math.log(Math.E);    //e为底的对数函数，其实就是ln，我们可以直接使用Math中定义好的e
        Math.log10(100);     //10为底的对数函数
//        Math.log2(3);  报错：无法解析log2
        //利用换底公式，我们可以弄出来任何我们想求的对数函数
        double a = Math.log(4) / Math.log(2);   //这里是求以2为底4的对数，log(2)4 = ln4 / ln2
        System.out.println(a);

//---------------------------------------------------------------------------
        System.out.println(Math.ceil(-3.3));
        Math.ceil(4.5);    //通过使用ceil来向上取整
        Math.floor(5.6);   //通过使用floor来向下取整

//    ---------------------------------------------------------------------------

        Random random = new Random();   //创建Random对象
        for (int i = 0; i < 30; i++) {
            System.out.print(random.nextInt(100)+" ");  //nextInt方法可以指定创建0 - 99之内的随机数
        }
        System.out.println(random.nextDouble());
        System.out.println(random.nextInt());
    }


}
