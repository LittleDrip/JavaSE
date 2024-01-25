package 数据结构基础.collection;

public class HashTable<E> {
    private final int TABLE_SIZE = 10;
    private final Object[] TABLE = new Object[TABLE_SIZE];

    public void insert(E element){
        int index = hash(element);
        TABLE[index] = element;
    }

    public boolean contains(E element){
        int index = hash(element);
        return TABLE[index] == element;
    }

    private int hash(Object object){   //哈希函数，计算出存放的位置
        int hashCode = object.hashCode();
        //每一个对象都有一个独一无二的哈希值，可以通过hashCode方法得到（只有极小的概率会出现相同的情况）
        return hashCode % TABLE_SIZE;
    }
}