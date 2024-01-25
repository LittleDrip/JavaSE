package 异常机制.异常处理;

public class Main2 {
    public static void main(String[] args) {
        a();
    }
    static void a(){
        b();
    }
    static void b(){
        try {
            c();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    static void c() throws Exception {
        throw new Exception("我是异常");
    }
}
