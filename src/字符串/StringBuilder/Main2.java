package 字符串.StringBuilder;

public class Main2 {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
        builder.append("aaa").append("bbb");
        builder.delete(3,5);
        System.out.println(builder.toString());
        String a="Hello World";
        String b=a.replace("Hello","Hi");
        System.out.println(b);
        builder.replace(0,3,"Hi");
        System.out.println(builder);
    }
}
