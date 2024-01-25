package 数据结构基础.collection;

import java.util.NoSuchElementException;

public class LinkedStack<E> {
    private final Node<E> head=new Node<>(null);
    public boolean isEmpty(){ return head.next==null;}
    public void push(E element){
        Node<E> node = new Node<>(element);   //直接创建新结点
        node.next = head.next;    //新结点的下一个变成原本的栈顶结点
        head.next = node;     //头结点的下一个改成新的结点
    }
    public E pop(){
        if(head.next == null)   //如果栈已经没有元素了，那么肯定是没办法取的
            throw new NoSuchElementException("栈为空");
        E e = head.next.element;   //先把待出栈元素取出来
        head.next = head.next.next;   //直接让头结点的下一个指向下一个的下一个
        return e;
    }
    private static class Node<E> {
        private E element;
        private Node<E> next;
        public Node(E e) {
            this.element = e;
        }
    }

}
