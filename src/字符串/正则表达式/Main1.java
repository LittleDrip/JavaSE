package 字符串.正则表达式;

public class Main1 {
    public static void main(String[] args) {
            String str="oooo";
        System.out.println(str.matches("o+"));//+表示对前面这个字符匹配一次或多次，这里字符串是oooo，正好可以匹配
        String a="zoo";
        System.out.println(a.matches("zo+"));
        /*匹配前面的子表达式零次或多次。*/
        System.out.println(a.matches("zo*"));
        System.out.println(str.matches("o?"));
        //匹配o零次或多次，匹配zo一次或多次
        System.out.println(a.matches("o*zo+"));
        //匹配4次（指定）
        System.out.println(str.matches("o{4}"));
        String c="acbc";
        System.out.println(c.matches("[abc]*"));//匹配带有a或b或c的字符,*是零次或多次
        String d="iqwiuue";
        System.out.println(d.matches("[^abc]*"));//匹配不带有a或b或c的字符,*是零次或多次
        String e="asdsa-d";
        System.out.println(e.matches("[a-z]*"));//匹配a-z
        System.out.println(c.matches("\\w*"));



    }
}
