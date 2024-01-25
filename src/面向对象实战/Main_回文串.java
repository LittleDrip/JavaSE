package 面向对象实战;

import java.util.Scanner;

public class Main_回文串 {
    public static void main(String[] args) {
        String str="ABCBA";


    }
    /*
     private static boolean method(String a){
        if(a==null) return false;
        for (int i = 0,j = a.length()-1; i < a.length()/2; i++,j--) {
                if(a.charAt(i)!=a.charAt(j)) return false;
        }
            return true;
    }*/
    private static boolean test(){
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        char[] chars=s.toCharArray();
        int i=0,j=chars.length-1;
        while (i<j){
            if(chars[i]!=chars[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
