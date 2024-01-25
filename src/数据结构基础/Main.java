package 数据结构基础;

import 数据结构基础.collection.*;

public class Main {
    public static void main(String[] args) {
        //ArrayList 顺序表
/*    ArrayList<String> list=new ArrayList<>();
        list.add("aaa",0);
          list.add("bbb",1);
          list.remove(0);
        System.out.println(list.get(2));
       for (int i = 0; i < 30; i++) {
            list.add(i+"",i);
        }
        System.out.println(list.toString());*/
       //LinkedList 链表
/*  LinkedList<Integer> list = new LinkedList<>();
        list.add(10, 0);
        list.add(30, 0);
        list.add(20, 1);
        list.remove(0);
        System.out.println(list.get(0));
        System.out.println(list);

        System.out.println(((int)'a'));*/
        //栈
/*    LinkedStack<String> stack = new LinkedStack<>();
        stack.push("AAA");
        stack.push("BBB");
        stack.push("CCC");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
*/
        //队列
/*  LinkedQueue<String> queue = new LinkedQueue<>();
            queue.offer("AAA");
            queue.offer("BBB");
            queue.offer("CCC");
            System.out.println(queue.poll());
            System.out.println(queue.poll());
            System.out.println(queue.poll());*/
        //二叉树
 /*       TreeNode<Character> a = new TreeNode<>('A');
        TreeNode<Character> b = new TreeNode<>('B');
        TreeNode<Character> c = new TreeNode<>('C');
        TreeNode<Character> d = new TreeNode<>('D');
        TreeNode<Character> e = new TreeNode<>('E');
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        preOrder(a);inOrder(a);postOrder(a);*/
        //哈希表
        HashTable<Integer> hashTable=new HashTable<>();
        hashTable.insert(11);
        System.out.println(hashTable.contains(11));
    }
    private static <T> void preOrder(TreeNode<T> root){
        if(root == null) return;
        System.out.print(root.element);
        preOrder(root.left);
        preOrder(root.right);
    }
    private static <T> void inOrder(TreeNode<T> root){
        if(root == null) return;
        inOrder(root.left);    //先完成全部左子树的遍历
        System.out.print(root.element);    //等待左子树遍历完成之后再打印
        inOrder(root.right);    //然后就是对右子树进行遍历
    }
    private static <T> void postOrder(TreeNode<T> root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.element);  //时机延迟到最后
    }
    private static <T> void levelOrder(TreeNode<T> root){
        LinkedQueue<TreeNode<T>> queue = new LinkedQueue<>();  //创建一个队列
        queue.offer(root);    //将根结点丢进队列
        while (!queue.isEmpty()) {   //如果队列不为空，就一直不断地取出来
            TreeNode<T> node = queue.poll();   //取一个出来
            System.out.print(node.element);  //打印
            if(node.left != null) queue.offer(node.left);   //如果左右孩子不为空，直接将左右孩子丢进队列
            if(node.right != null) queue.offer(node.right);
        }
    }
}

