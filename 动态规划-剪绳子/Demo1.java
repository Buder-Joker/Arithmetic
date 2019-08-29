package 算法.动态规划;
/*
剪绳子 使剪出来的绳子长度之积最大
 */
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(MaxJi(n));
    }

    private static int MaxJi(int n) {
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        if(n==3){
            return 2;
        }
        int[] a = new int[n+1];
        a[0] = 0;
        a[1] = 1;
        a[2] = 2;
        a[3] = 3;
        int max = 0;
        for(int i=4; i<=n; i++){
            max = 0;
            for(int j=1; j<=i/2; j++){
                int part = a[j]*a[i-j];
                if(max<part){
                    max = part;
                }
                a[i] = max;
            }
        }
        max = a[n];
        return max;

    }
}
