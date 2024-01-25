package 数组.一维数组;

import java.util.Arrays;

public class MainTest3 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 4, 5};

//        System.out.println(a.equals(b)); --->false

//        要通过for循环一个一个去比较
//        System.out.println(equal(a,b));
//       !!! 遍历输出数组元素
//      1.  System.out.println(Arrays.toString(a)); --->[1, 2, 3, 4, 5]
//      2.for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i]+" ");
//        }                                         --->1 2 3 4 5
//       3. for (int i : a) {
//            System.out.print(i+" ");
//        }
//    }                                             --->1 2 3 4 5

   /* public static boolean equal(int[] a,int[] b){
        for (int i = 0; i < a.length; i++)
            if(a[i]!=b[i]) return false;
        return true;
    }*/
    }
}
