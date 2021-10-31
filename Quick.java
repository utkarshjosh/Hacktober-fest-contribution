package com.company;
import java.util.Arrays;

public class Quick {
    public static void Quicksort(int[] arr,int start,int end){
        if(start<end){
            int pindex=partition(arr,start ,end);
            Quicksort(arr,start,pindex);
            Quicksort(arr,pindex+1,end);
        }
        else return;
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot=arr[start];
        int pindex=start;
        for(int i=start;i<=end;i++){
            if(arr[i]<pivot){
                pindex++;
                int temp=arr[i];
                arr[i]=arr[pindex];
                arr[pindex]=temp;
            }
        }
        arr[start]=arr[pindex];
        arr[pindex]=pivot;
        return pindex;
    }




    public static void main(String[] args) {
        int[] a={4, 8, 1, 3, 0, 2, 8, 8, 9 ,5, 3};
        System.out.println(Arrays.toString(a));
        partition(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
        Quicksort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
