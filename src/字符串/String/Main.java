package 字符串.String;

public class Main {
    public static void main(String[] args) {
        /*注意，如果是直接使用双引号创建的字符串，
        如果内容相同，为了优化效率，那么始终都是同一个对象：*/
        String str1 = "Hello World";
        String str2 = "Hello World";
        System.out.println(str1 == str2);
        /*但是如果我们使用构造方法主动创建两个新的对象，那么就是不同的对象了：：*/
        String str3 = new String("Hello World");
        String str4 = new String("Hello World");
        System.out.println(str3 == str4);
        /*至于为什么会出现这种情况，我们在JVM篇视频教程中会进行详细的介绍，这里各位小伙伴只需要记住就行了。
        因此，如果我们仅仅是想要判断两个字符串的内容是否相同，不要使用==，
        String类重载了equals方法用于判断和比较内容是否相同：*/
        String str5 = new String("Hello World");
        String str6 = new String("Hello World");
        System.out.println(str5.equals(str6));   //字符串的内容比较，一定要用equals
    }
}
