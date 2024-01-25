package 异常机制.抛出异常;

public class Main {
    public static void main(String[] args) throws Exception {
//            test(1,0);
            test2();
    }
    public static int test(int a,int b){
        if(b==0)
            throw new ArithmeticException("除数不能为0");
        return a/b;
    }
    public static int test2() throws Exception {

            throw new Exception("我是编译时异常");  //使用throws关键字告知调用方此方法会抛出哪些异常，请调用方处理好
            /*如果我们在方法中抛出了一个非运行时异常，那么必须告知函数的调用方我们会抛出某个异常，
            函数调用方必须要对抛出的这个异常进行对应的处理才可以：*/

    }
}
