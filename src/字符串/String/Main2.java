package 字符串.String;

public class Main2 {
    public static void main(String[] args) {
        /*裁剪*/
        String str = "Hello World";
        String sub = str.substring(0, 3);   //分割字符串，并返回一个新的子串对象0,1,2不包含3，但是共有三个
        System.out.println(sub);
        String sub2 = str.substring(str.length() - 3, str.length());
        System.out.println(sub2);

        String org = "Hello World";
        String[] strings = org.split(" ");   //使用split方法进行字符串分割，比如这里就是通过空格分隔，得到一个字符串数组
        for (String string : strings) {
            System.out.println(string);
        }
/*字符数组和字符串之间是可以快速进行相互转换的：*/
        String str2 = "Hello World";
        char[] chars = str2.toCharArray();
        System.out.println(chars);

        char[] chars2={'1','2','3'};
        String a=new String(chars2);
        System.out.println(a);

        String test="Hello World";
    /*    test.toUpperCase();//小写
        test.toUpperCase();//大写
        System.out.println(test.startsWith("Hello"));
        System.out.println(test.endsWith("ld"));
        System.out.println(test.indexOf("World"));//第一次出现的位置
        System.out.println(test.indexOf("Word"));
        System.out.println(test.lastIndexOf('o'));//最后一次出现的位置
            System.out.println(test.isEmpty());//判断是否为空*/
    }
}
