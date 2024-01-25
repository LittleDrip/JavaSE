package 泛型.函数式接口;

import java.util.function.Function;

public class Main3 {
    /*Function函数型函数式接口：*/
    //这个接口消费一个对象，然后会向外供给一个对象（前两个的融合体）
//  这里实现了一个简单的功能，将传入的int参数转换为字符串的形式
    private static final Function<Integer, String> INTEGER_STRING_FUNCTION = Object::toString;
    public static void main(String[] args) {
        String str = INTEGER_STRING_FUNCTION.apply(10);
        System.out.println(str);

        String str2 = INTEGER_STRING_FUNCTION
                .compose(String::length)   //将此函数式的返回值作为当前实现的实参
                .apply("lbwnb");   //传入上面函数式需要的参数
        System.out.println(str2);

        Boolean str3 = INTEGER_STRING_FUNCTION
                .andThen(String::isEmpty)   //在执行完后，返回值作为参数执行andThen内的函数式，最后得到的结果就是最终的结果了
                .apply(10);
        System.out.println(str3);
    }
}
