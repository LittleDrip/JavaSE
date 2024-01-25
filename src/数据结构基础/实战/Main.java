package 数据结构基础.实战;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer[] a={1,3,2,54,44};
        LinkedList<Integer> list=new LinkedList<>(Arrays.asList(a));
        Collections.reverse(list);
        System.out.println(list);

    }
}
