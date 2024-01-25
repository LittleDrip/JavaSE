package 异常机制.异常处理;

public class Main4 {
    public static void main(String[] args) {
        try {
            int[] a=new int[2];
            a[-1]=10;
        }catch (Exception e){

        }finally {
            System.out.println("lbwnb");   //无论是否出现异常，都会在最后执行
        }
    }
}
