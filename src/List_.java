import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_ {
    public static void main(String[] args) {
        Integer[] a={1,44,2,33,5};
        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(a));//这里初始化可以传入Collection对象
        List<Integer> list1=Arrays.asList(a);//返回值是一个List类型对象,里面返回的是内部定义的Arraylist，其中内部定义的数组a是final
        list1.add(444);//所以这里会报错，因为asList方法不允许他删除或添加,因此初始化可以用java.util.ArrayList类来初始化
        List<Integer> list2=new ArrayList<>(Arrays.asList(a));//这样a就能插入删除了
      /*  Collections.reverse(list);
        System.out.println(list);*/
        System.out.println(list1);//打印1
    }
}
