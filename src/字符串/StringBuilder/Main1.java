package 字符串.StringBuilder;

public class Main1 {
    public static void main(String[] args) {
        String str1 = "你看";
        String str2 = "这";
        String str3 = "汉堡";
        String str4 = "做滴";
        String str5 = "行不行";
        String result = str1 + str2 + str3 + str4 + str5;   //5个变量连续加
        System.out.println(result);
        /*
        * 如果直接使用加的话，每次运算都会生成一个新的对象，这里进行4次加法运算，
        * 那么中间就需要产生4个字符串对象出来，是不是有点太浪费了？
        * 这种情况实际上会被优化为下面的写法：*/
        StringBuilder builder = new StringBuilder();
        builder.append(str1).append(str2).append(str3).append(str4).append(str5);
        System.out.println(builder.toString());
        /*
        * 我们可以使用它来对字符串进行拼接、裁剪等操作，
        * 它就像一个字符串编辑器，弥补了字符串不能修改的不足：*/
    }
}
