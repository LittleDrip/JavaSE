package 面向对象实战;



public class Main_二分搜索 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 7, 8, 10, 11, 13, 15};
        int target = 3;
        System.out.println(search(arr, target));
        System.out.println(binarySearch(arr,0,arr.length-1,6));
    }
    public static int search(int[] arr,int target){
        int left=0,right=arr.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            int i=arr[mid];
            if(i>target) right=mid-1;
            else if(i<target) left=mid+1;
            else return mid;
        }
        return -1;
    }
    public static int binarySearch(int[] arr,int left,int right,int target){
        if(left>right) return -1;
        int mid=(left+right)/2;
        if(arr[mid]>target)  return binarySearch(arr,left,mid-1,target);
        else if(arr[mid]<target) return binarySearch(arr,mid+1,right,target);
        else return mid;
    }
}
