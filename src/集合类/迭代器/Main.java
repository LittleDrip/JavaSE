package 集合类.迭代器;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list=new LinkedList<>(Arrays.asList("A","B","C"));
        /*for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }*/ //代码运行效率太低
        for (String s : list) {
            System.out.print(s + " ");
        }//这里编译后会变成迭代器方式↓
        System.out.println();
      Iterator<String> iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
//        注意，迭代器的使用是一次性的，用了之后就不能用了，
//        如果需要再次进行遍历操作，那么需要重新生成一个迭代器对象。为了简便，
//        我们可以直接使用foreach语法来快速遍历集合类，效果是完全一样的：


        /*在Java8提供了一个支持Lambda表达式的forEach方法，这个方法接受一个Consumer，也就是对遍历的每一个元素进行的操作：*/
        list.forEach(System.out::println);//consumer去消费遍历出来的每一个元素
        list.forEach(s -> System.out.println(s));

    }
}
