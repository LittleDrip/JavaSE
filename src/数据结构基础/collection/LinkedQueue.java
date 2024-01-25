package 数据结构基础.collection;

import java.util.NoSuchElementException;

public class LinkedQueue<E> {

    private final Node<E> head = new Node<>(null);

    public void offer(E element){  //入队操作
        Node<E> last = head;
        while (last.next != null)   //入队直接丢到最后一个结点的屁股后面就行了
            last = last.next;
        last.next = new Node<>(element);
    }

    public E poll(){   //出队操作
        if(head.next == null)   //如果队列已经没有元素了，那么肯定是没办法取的
            throw new NoSuchElementException("队列为空");
        E e = head.next.element;
        head.next = head.next.next;   //直接从队首取出
        return e;
    }

    public boolean isEmpty() {
        return head.next==null;
    }

    private static class Node<E> {
        E element;
        Node<E> next;

        public Node(E element) {
            this.element = element;
        }
    }
}