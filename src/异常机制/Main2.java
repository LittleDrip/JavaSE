package 异常机制;

public class Main2
{
    public static void main(String[] args) {
//        test();//StackOverflowError

//        Object[] objects = new Object[Integer.MAX_VALUE]; //OutOfMemoryError
        /*
        * 实际上我们电脑的内存是有限的，不可能无限制地使用内存来存放变量，所以说如果内存不够用了，会直接：
            此时没有更多的可用内存供我们的程序使用，那么程序也就没办法继续运行下去了，这同样是一个很严重的错误。*/
    }
     public static void test()
     {
         test();
     }

}
