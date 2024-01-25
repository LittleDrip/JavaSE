package 数组.多维数组;

public class Main {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] arr2=new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] arr3=new int[3][3];
        arr3= new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
//        int[] a=arr[0];
//        int[] b=arr[1];
//        System.out.println(a);
//        可以修改↓
        arr[0]=new int[]{0,0,0,0};
        System.out.println(arr[0][3]);
//遍历输出
  /*  1--> for (int[] i: arr) {
            for (int j:i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    2-->    for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
*/
    }
}
