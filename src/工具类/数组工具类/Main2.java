package 工具类.数组工具类;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] target = Arrays.copyOfRange(arr, 3, 5);   //也可以只拷贝某个范围内的内容
        System.out.println(Arrays.toString(target));
        System.out.println(arr == target);


        int[] arr2 = new int[]{1, 2, 3, 4, 5};
        int[] target2 = new int[10];
        System.arraycopy(arr2, 0, target2, 0, 5);   //使用System.arraycopy进行搬运
        System.out.println(Arrays.toString(target2));



            int[] arr3 = new int[]{1, 2, 3, 4, 5};
            System.out.println(Arrays.binarySearch(arr, 5));   //二分搜索仅适用于有序数组

    }
}
