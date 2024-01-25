package 泛型;

public class Main3 {
    /*
    * 当然，类型变量并不是只能在泛型类中才可以使用，我们也可以定义泛型方法。
     当某个方法（无论是是静态方法还是成员方法）需要接受的参数类型并不确定时，我们也可以使用泛型来表示：*/
    public static void main(String[] args) {
        String a=test("123");
        Integer b=test(123);

    }
    public static <T> T test(T t){

        return t;
    }
}
