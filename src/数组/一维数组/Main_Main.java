package 数组.一维数组;

public class Main_Main {
    public static void main(String[] args) {
        /*
        * 由于基本数据类型和引用类型不同，
        * 所以说int类型的数组时不能被Object类型的数组变量接收的：*/
        int a=10;
        Object object=a;
        /*
        * 这里a被自动装箱了—>Integer.valueOf(a)
        * 因此不能将int类型转换成Object类型*/
//        System.out.println(object.getClass());--->class java.lang.Integer

//        引用类型和引用类型是可以相互接收转换的
        String[] str=new String[10];
        Object[] objects=str;//数组同样支持向上转型

        Object[] arr = new Object[10];
        String[] array = (String[]) arr;   //也支持向下转型


    }
}
