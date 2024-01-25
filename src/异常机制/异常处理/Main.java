package 异常机制.异常处理;

public class Main {
    public static void main(String[] args) {
        try {//使用try-catch语句进行异常捕获
            Object object=null;
            object.toString();
        }
        catch (NullPointerException e){
//            e.getMessage();
            e.printStackTrace();
        }
        System.out.println("程序正常进行" );
    }
}
