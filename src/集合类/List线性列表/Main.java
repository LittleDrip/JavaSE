package 集合类.List线性列表;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
        * List列表（线性表），线性表支持随机访问，相比之前的Collection接口定义，功能还会更多一些。首先介绍ArrayList，
        * 我们已经知道，它的底层是用数组实现的，内部维护的是一个可动态进行扩容的数组，
        * 也就是我们之前所说的顺序表，跟我们之前自己写的ArrayList相比，它更加的规范，并且功能更加强大，同时实现自List接口。*/
        // 是一个有序的集合，插入元素默认是插入到尾部，按顺序从前往后存放，每个元素都有一个自己的下标位置
        // 列表中允许存在重复元素 判断是equals，不是==
//        ArrayList具体方法 （其中很多地方重新定义了一次Collection接口中定义的方法）↓
        /*


 public interface List<E> extends Collection<E> {
    ...

    //将给定集合中所有元素插入到当前结合的给定位置上（后面的元素就被挤到后面去了，跟我们之前顺序表的插入是一样的）
    boolean addAll(int index, Collection<? extends E> c);

    ...

   	//Java 8新增方法，可以对列表中每个元素都进行处理，并将元素替换为处理之后的结果
    default void replaceAll(UnaryOperator<E> operator) {
        Objects.requireNonNull(operator);
        final ListIterator<E> li = this.listIterator();  //这里同样用到了迭代器
        while (li.hasNext()) {
            li.set(operator.apply(li.next()));
        }
    }

    //对当前集合按照给定的规则进行排序操作，这里同样只需要一个Comparator就行了
    @SuppressWarnings({"unchecked", "rawtypes"})
    default void sort(Comparator<? super E> c) {
        Object[] a = this.toArray();
        Arrays.sort(a, (Comparator) c);
        ListIterator<E> i = this.listIterator();
        for (Object e : a) {
            i.next();
            i.set((E) e);
        }
    }

    ...

    //-------- 这些是List中独特的位置直接访问操作 --------

   	//获取对应下标位置上的元素
    E get(int index);

    //直接将对应位置上的元素替换为给定元素
    E set(int index, E element);

    //在指定位置上插入元素，就跟我们之前的顺序表插入是一样的
    void add(int index, E element);

    //移除指定位置上的元素
    E remove(int index);


    //------- 这些是List中独特的搜索操作 -------

    //查询某个元素在当前列表中的第一次出现的下标位置
    int indexOf(Object o);

    //查询某个元素在当前列表中的最后一次出现的下标位置
    int lastIndexOf(Object o);


    //------- 这些是List的专用迭代器 -------

    //迭代器我们会在下一个部分讲解
    ListIterator<E> listIterator();

    //迭代器我们会在下一个部分讲解
    ListIterator<E> listIterator(int index);

    //------- 这些是List的特殊转换 -------

    //返回当前集合在指定范围内的子集
    List<E> subList(int fromIndex, int toIndex);

    ...
}*/
//        ————————————————————————————————————————
//        一般的，如果我们要使用一个集合类，我们会使用接口的引用：
//        【详情：使用ArrayList类为什么用List接口声明？】https://blog.csdn.net/wjc78242663/article/details/101630449
        List<String> list=new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("aaa");
//        System.out.println(list.get(0));
//        System.out.println(list.remove("aaa"));
//        ———————————————————————————————————————— 排序
       /* list.sort(String::compareTo);//方法引用String默认排序->正序
        list.sort((o1,o2)->o1.compareTo(o2));//lambda表达式->正序
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });//倒序
        list.sort(Comparator.reverseOrder());//接口方法引用->倒序*/
//        System.out.println(list);
//        ———————————————————————————————————————— toArray
    /*    Object[] array = list.toArray();//默认返回Object类型数组
        String[] arr=list.toArray(new String[0]);//长度随便写，目的是知道传入的是什么类型的
        System.out.println(Arrays.toString(arr));
//        indexof查找到返回到下标（有多个找第一个），没找到返回-1
        System.out.println(list.indexOf("aaa"));
        System.out.println(list.indexOf("aac"));
        System.out.println(list.lastIndexOf("aaa"));*/
//        ———————————————————————————————————————— asList(只读)
        List<String> list1=Arrays.asList("111","222","333");
        //注意：asList方法可以传入多个数或数组，并返回List,但是返回的值不允许增删，是final类型的
//        list1.add("113");//报错
//        要生成正常使用的，我们可以将这个只读的列表作为参数传入：
        List<String> list2 = new ArrayList<>(Arrays.asList("A", "B", "C"));
        System.out.println(list2);
        //或者可以这样↓
        List<String> list3=new ArrayList<>();
        list3.addAll(Arrays.asList("aaa","bbb","ccccc"));
        System.out.println(list3);
//        ———————————————————————————————————————— 移除操作remove
        List<String> list4=new ArrayList<>();
        list4.add("AAA");
        list.add("AAAA");
        list.add("AAAAA");
        list.add("BBB");
        list.removeIf(s -> s.length()==3);//移除长度为3的元素
        System.out.println(list);
//        ———————————————————————————————————————— LinkedList
        List<String> list5=new LinkedList<>();
        list5.add("aaa");
        list5.remove("aaa");



    }
}
