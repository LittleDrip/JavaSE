package 数组.一维数组;

import java.util.Arrays;

public class MainTest {
    public static void main(String[] args) {
        /*注意，数组类型比较特殊，它本身也是类，但是编程不可见（底层C++写的，在运行时动态创建）
        即使是基本类型的数组，也是以对象的形式存在的，并不是基本数据类型。
        所以，我们要创建一个数组，同样需要使用new关键字：*/
        int[] array=new int[10];
        int[] array2=new int[]{1,2,3,4,5};
        int[] array3={5,4,3,2,1};
//        !!!!->数组最大只能是int类型的最大值
//        int[] array4=new int[Integer.MAX_VALUE];
        System.out.println(array);
//        Object object=array;
//        int []a=array.clone();
//        System.out.println(array.toString()); --->[I@4eec7777
//        System.out.println(Arrays.toString(array)); --->[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

//        访问第一个元素  System.out.println(array2[0]); int a=array2[0];


    }
}
