package 集合类.迭代器;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<String> list=new LinkedList<>(Arrays.asList("A","B","C"));
        Iterator<String> iterator = list.iterator();
        System.out.println(iterator.next());
        iterator.remove();
        System.out.println(list);

    }
}
