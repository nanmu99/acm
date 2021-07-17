package com.ppp.test;

import java.util.Arrays;

/**
 * @auther ppp
 * @create 2021-04-05 8:48
 */
public class TestScore {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,1};

        //快速排序
//        quick_sort(arr,0,arr.length-1);
//        System.out.println(Arrays.toString(arr));
//        int i = quick_Sort_K(arr, 0, arr.length - 1, 4);
//        System.out.println(i);
        //归并排序
//        merge_sort(arr,0,arr.length-1);
//        System.out.println(Arrays.toString(arr));
//        long l = merge_sort_dui(arr, 0, arr.length - 1);
////        System.out.println(l);
        System.out.println(handle(12354));
    }

    public static  void quick_sort(int arr[],int l,int r){
        if(l>=r){
            return;
        }
        int i=l-1,j=r+1,x=arr[(l+r)/2];
        int temp=0;
        while(i<j){
            while(arr[++i]<x);
            while(arr[--j]>x);
            if(i<j){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        quick_sort(arr,l,j);
        quick_sort(arr,j+1,r);
    }

    public static  int quick_Sort_K(int arr[],int left,int right,int k){
        if(left>=right){
            return arr[left];
        }
        int i= left-1,j=right+1,x=arr[(left+right)/2];
        int temp = 0;
        while(i<j){
            while(arr[++i]<x);
            while(arr[--j]>x);
            if(i<j){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int sl = j-left+1;
        if(sl>k){
           return  quick_Sort_K(arr,i,j,k);
        }

        return quick_Sort_K(arr,j+1,right,k-sl);
    }


    public static void merge_sort(int arr[],int left,int right){
        if(left>=right){
            return ;

        }
        int mid = left + right >> 1;
        merge_sort(arr,left,mid);
        merge_sort(arr,mid+1,right);
        int i=left,j=mid+1,k=0;
        int temp[] = new int[1000];
        while(i<=mid&&j<=right){
            if(arr[i]<=arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }

        while(i<=mid){
            temp[k++] = arr[i++];
        }

        while(j<=right){
            temp[k++] = arr[j++];
        }

        for(i=left,j=0;i<=right;i++,j++){
            arr[i] = temp[j];
        }
    }

    public static long merge_sort_dui(int arr[],int left,int right){
        if(left>=right){
            return 0;
        }
        int mid = (left+right)/2;
        long result = merge_sort_dui(arr,left,mid)+merge_sort_dui(arr,mid+1,right);
        int k=0,i=left,j=mid+1;
        int temp[] = new int[1000];
        while(i<=mid&&j<=right){
            if(arr[i]<=arr[j]){
                temp[k++] = arr[i++];
            }else{
                result += mid-left+1;
                temp[k++] = arr[j++];
            }
        }
        while(i<=mid){
            temp[k++] = arr[i++];
        }

        while(j<=right){
            temp[k++] = arr[j++];
        }
        for(i=left,j=0;i<=right;i++,j++){
            arr[i] = temp[j];
        }

        return result;
    }


    public static  int handle(int num){
        int result = 0;
        int i = num;
        while(i!=0){
            i=i/10*10;
            result = result*10+num-i;
            i=i/10;
            num = num/10;
        }
        return result;
    }

}
