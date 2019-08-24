package 算法;

import java.util.Scanner;
import java.util.Stack;

/*
倒排单词
i am a student

输出: student a am i
 */
public class Demo7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        //daopai(str);
        System.out.println();
        Stack<String> stack = new Stack<>();
        String[] strings = str.split(" ");
        for (int i = 0; i < strings.length; i++) {
            stack.push(strings[i]);
        }
        while(!stack.isEmpty()){
            System.out.print(stack.peek()+" ");
            stack.pop();
        }
    }
    private static void daopai(String str){
        Stack<String> stack = new Stack<>();
        //char[] arr = str.toCharArray();
        for(int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
        /*while(!stack.isEmpty()){
            System.out.print(stack.peek());
            stack.pop();
        }*/
    }
}
