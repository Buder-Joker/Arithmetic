package 排序.归并排序;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        int[] arr = new int[]{5,3,1,9,7,4,6,2,8};
        int start = 0;
        int end = arr.length-1;
        martSort(arr,start,end);
        System.out.println(Arrays.toString(arr));
    }
    public static void martSort(int[] arr,int start,int end){
        if(start>=end){
            return;
        }
        int mid = (start+end)>>>1;
        martSort(arr,start,mid);
        martSort(arr,mid+1,end);
        mart(arr,start,mid,end);

    }

    private static void mart(int[] arr, int start, int mid, int end) {
        int[] temp = new int[arr.length];
        int index1 = start;
        int index2 = mid+1;
        int i =start;

        while(start<=mid&&index2<=end){
            if(arr[start]<=arr[index2]){
                temp[index1++] = arr[start++];
            }else{
                temp[index1++] = arr[index2++];
            }
        }
        while (start<=mid){
            temp[index1++] = arr[start++];
        }
        while (index2<=end){
            temp[index1++] = arr[index2++];
        }
        while(i<=end){
            arr[i] = temp[i];
            i++;
        }
    }
}
