package 数据结构基础.collection;

public class LinkedList<E> {
    private final Node<E> head=new Node<>(null);
    private int size=0;
    private class Node<E>{
        private E element;
        Node<E> next;
        public Node(E e){
            this.element=e;
        }
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void add(E element, int index){
        if(index < 0 || index > size)
            throw new IndexOutOfBoundsException("插入位置非法，合法的插入位置为：0 ~ "+size);
        Node<E> prev = head;
        for (int i = 0; i < index; i++)
            prev = prev.next;
        Node<E> node = new Node<>(element);
        node.next = prev.next;
        prev.next = node;
        size++;
    }
    public E remove(int index){
        if(index < 0 || index > size)
            throw new IndexOutOfBoundsException("插入位置非法，合法的插入位置为：0 ~ "+size);
        Node<E> prev = head;
        for (int i = 0; i < index; i++)
            prev = prev.next;
        Node<E> i=prev.next;
        prev.next=i.next;
        size--;
        return i.element;

    }
    public E get(int index){
        if(index<0 || index>size-1)
            throw new IndexOutOfBoundsException("非法的位置，合法的位置为0- "+(size-1));
        Node<E> p=head;
        for (int i = 0; i <= index; i++) {
            p=p.next;
        }
        return p.element;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node<E> node = head.next;   //从第一个结点开始，一个一个遍历，遍历一个就拼接到字符串上去
        while (node != null) {
            builder.append(node.element).append(" ");
            node = node.next;
        }
        return builder.toString();
    }
}
