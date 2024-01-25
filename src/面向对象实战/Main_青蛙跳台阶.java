package 面向对象实战;

public class Main_青蛙跳台阶 {
    public static void main(String[] args) {
        /*
        *  青蛙跳台阶问题(动态规划)

现在一共有n个台阶，一只青蛙每次只能跳一阶或是两阶，那么一共有多少种跳到顶端的方案？

例如n=2，那么一共有两种方案，一次性跳两阶或是每次跳一阶。

现在请你设计一个Java程序，计算当台阶数为n的情况下，能够有多少种方案到达顶端。*/
        System.out.println(jump(4));

    }
    /*private static int jump(int n){
        int[] arr=new int[n+1];
        arr[0]=1;
        arr[1]=1;
        for (int i = 2; i <= n; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];

    }*/
    private static int jump(int n){
        if(n==0||n==1) return 1;
        else return jump(n-1)+jump(n-2);

    }
}
