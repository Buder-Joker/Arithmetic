package 字符串;

import java.util.Scanner;

public class leet1 {
    public static boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote==""){
            return true;
        }
        if(magazine==""){
            return false;
        }
        char[] arr = ransomNote.toCharArray();
        char[] brr = magazine.toCharArray();
        int k = 0;
        for(int i=0; i<brr.length; i++){
            if(brr[i]==arr[k]){
                k++;
                if(k==arr.length){
                    return true;
                }
            }else{
                k=0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        System.out.println(canConstruct(str1,str2));
    }
}
