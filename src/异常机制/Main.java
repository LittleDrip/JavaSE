package 异常机制;

public class Main {
    public static void main(String[] args) {
//        test(1, 0);   //当b为0的时候，还能正常运行吗？
//        ArithmeticException 算数异常

//        test2(null);//NullPointerException 空指针异常，因为null不是任何对象
        /*Cannot invoke "String.length()" because "a" is null*/
        Object object=new Object();
//        Main main=(Main) object;//ClassCastException 类转换异常
        /*以上是运行时异常*/
//        -------------------------------------------------------------

        //以下是编译时异常
       Main main=new Main();
       /* 被复制的类需要实现Clonenable接口（不实现的话在调用clone方法会抛出CloneNotSupportedException异常),该接口为标记接口(不含任何方法)*/
//       main.clone();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    private static int test(int a, int b){
        return a/b;   //没有任何的判断而是直接做计算
    }
    private static int test2(String a){
        return a.length();
    }
}
