package 数组;

public class Main {
    public static void main(String[] args) {
        final int[] a={1,2,3,4};
        //a数组的值可以修改
        a[0]=100;
        //但是数组这个引用类型的对象不能修改
//!!!报错：   a=new int[]{1,2,3}; --->无法将值赋给 final 变量 'a
    }
}
