package 异常机制.异常处理;

public class Main3 {
    public static void main(String[] args) {
        try {
            int[] a = new int[10];
            a[-1] = 10;
        } catch (NullPointerException e) {

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组越界");

        } catch (RuntimeException e) {
            System.out.println("运行异常");
        }

       /* 以下写法错误
       try {
            //....
        } catch (RuntimeException e){  //父类型在前，会将子类的也捕获

        } catch (NullPointerException e) {   //永远都不会被捕获

        } catch (IndexOutOfBoundsException e){   //永远都不会被捕获

        }*/
    }
}