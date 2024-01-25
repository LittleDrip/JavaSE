package 数据结构基础.collection;

public class TreeNode<E> {
    public E element;
    public TreeNode<E> left, right;

    public TreeNode(E element){
        this.element = element;
    }
}
