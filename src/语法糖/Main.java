package 语法糖;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
//   1.比较     ——————————————————————————————————————————————
       Integer[] arr={1, 4, 5, 2, 6, 3, 0, 7, 9, 8};
      /*  Arrays.sort(arr);//正序
        System.out.println(Arrays.toString(arr));*/
        //倒序输出要自己利用比较器
        Arrays.sort(arr, new Comparator<Integer>()  {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;    //compare方法要求返回一个int来表示两个数的大小关系，大于0表示大于，小于0表示小于
                //这里直接o2-o1就行，如果o2比o1大，那么肯定应该排在前面，所以说返回正数表示大于
            }
        });
        Arrays.sort(arr,(a,b)-> b-a);
        System.out.println(Arrays.toString(arr));

//   2.copy复制     ——————————————————————————————————————————————
        String[] arr2 = {"AAA", "BBB", "CCC"};
        String[] newArr = Arrays.copyOf(arr2, 3);   //这里传入的类型是什么，返回的类型就是什么，也是用到了泛型
        System.out.println(Arrays.toString(newArr));
    }
}
