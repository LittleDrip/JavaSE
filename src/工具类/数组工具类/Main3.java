package 工具类.数组工具类;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        /*
        int[][] array = new int[][]{{2, 8, 4, 1}, {9, 2, 0, 3}};
        System.out.println(Arrays.deepToString(array));    //deepToString方法可以对多维数组进行打印
        */

        int[][] a = new int[][]{{2, 8, 4, 1}, {9, 2, 0, 3}};
        int[][] b = new int[][]{{2, 8, 4, 1}, {9, 2, 0, 3}};
        System.out.println(Arrays.equals(a, b));   //equals仅适用于一维数组
        System.out.println(Arrays.deepEquals(a, b));   //对于多维数组，需要使用deepEquals来进行深层次判断
    }
}
