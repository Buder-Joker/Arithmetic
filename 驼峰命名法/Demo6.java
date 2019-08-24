package 算法;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
驼峰命名法
输入:hello_word
    nice_to_meet_you

输出:helloWord
    niceToMeetYou

 */
public class Demo6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String str = in.nextLine();
            char[] arr = str.toCharArray();
            StringBuilder stringBuilder = new StringBuilder();
            for(int i=0; i<arr.length; ){
                if(arr[i]=='_'){
                    stringBuilder.append((arr[i+1]+"").toUpperCase());
                    i=i+2;
                    continue;
                }
                stringBuilder.append(arr[i]);
                i++;
            }
            System.out.println(stringBuilder.toString());
        }
    }
}
