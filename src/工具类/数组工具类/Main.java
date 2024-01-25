package 工具类.数组工具类;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr=new int[]{1, 4, 5, 8, 2, 0, 9, 7, 3, 6};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr); //可以对数组进行排序，将所有的元素按照从小到大的顺序排放
        System.out.println(Arrays.toString(arr));
//————————————————————————————————————————————————————————————————————————————————————————————
        int[] arr2 = new int[10];
        Arrays.fill(arr2, 66);
        System.out.println(Arrays.toString(arr2));
    }
}
