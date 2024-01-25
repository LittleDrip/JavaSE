package 数组.可边长参数;

public class MainTest {
    public static void main(String[] args) {
        test("2","22","abc","hello");//这里我们可以自由传入任意数量的字符串
        /*遍历*/

    }
    public static void test(String... strings){
        for (String a:strings) {
            System.out.print(a+" ");
        }
    }
    /*注意，如果同时存在其他参数，那么可变长参数只能放在最后*/
    public static void test2(int a,int b,String... strings){

    }
}
