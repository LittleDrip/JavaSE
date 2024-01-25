package 数据结构基础.collection;

public class ArrayList <E>{
    private int size=0;//记录已经存放了多少了，返回存在的长度。
    private int capacity=10;
    private Object[] array=new Object[capacity];

    public void add(E element,int index){
        if(index < 0 || index > size)    //插入之前先判断插入位置是否合法
            throw new IndexOutOfBoundsException("插入位置非法，合法的插入位置为：0 ~ "+size);
        if(size>=capacity){
            int newCapacity=capacity+(capacity >> 1);
            Object []newArray=new Object[newCapacity];
            System.arraycopy(array,0,newArray,0,size);
            array=newArray;
            capacity=newCapacity;
        }
        for (int i=size;i>index;i--){
            array[i]=array[i-1];
        }
        array[index]=element;
        size++;
    }
    @SuppressWarnings("unchecked")
    public  E remove(int index){
        if(index<0 ||index>size-1){
            throw new IndexOutOfBoundsException("删除位置非法，合法的删除位置为：0 ~ "+(size-1));
        }
        E e=(E) array[index];
        for (int i = index; i < size; i++) {
            array[i]=array[i+1];
        }
        size--;
        return e;
    }
    @SuppressWarnings("unchecked")
    public E get(int index) {

        if(index<0 ||index>size-1){
            throw new IndexOutOfBoundsException("删除位置非法，合法的删除位置为：0 ~ "+(size-1));
        }

        return (E) array[index];
    }
    public boolean isEmpty(){
        return size==0;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < size; i++) builder.append(array[i]).append(" ");
        return builder.toString();
    }

}
