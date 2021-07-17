package com.ppp.score;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @auther ppp
 * @create 2021-04-04 17:02
 */
public class acwing {
    public static void main(String[] args) {
//        int arr[] = {2,3,4,5,6,1};
//        quick_sort(arr,0,arr.length-1);
//        System.out.println(Arrays.toString(arr));
//        int i = quick_sort_K(arr, 0, arr.length - 1, 4);
//        System.out.println(i);
//        merge_sort(arr,0,arr.length-1);
//        System.out.println(Arrays.toString(arr));
//        long l = merge_sort_dui(arr, 0, arr.length - 1);
//        System.out.println(l);
//        int arr[] = {1,2,2,3,5};
//        int i = splitWord(arr);
//        System.out.println(i);
//        int n[] = {1,3,5};
//        int m[] = {1,2,3,4,5};
////        mubiao_he(n,m,6);
//        panduan_zi(n,m);
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("输入数字");
        while (x>0){
            int y = sc.nextInt();
            System.out.printf(lowbit(y)+" ");
        }


    }

    public static void quick_sort(int arr[],int l,int r){
        if(l>=r){
            return;
        }
        int i = l-1,j=r+1,x=arr[(l+r)/2];
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
        quick_sort(arr,l,j);
        quick_sort(arr,j+1,r);
    }

    public static int quick_sort_K(int arr[],int l,int r,int k){
        if(l>=r){
            return arr[l];
        }
        int i = l-1,j=r+1,x=arr[(l+r)/2];
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
        //分类讨论
        int s = j-l+1;
        if(s>k){
          return  quick_sort_K(arr,i,j,k);
        }

       return  quick_sort_K(arr,j+1,r,k-s);
    }

    public static void merge_sort(int arr[],int left,int right){
       if(left>=right){
           return;
       }

       int mid = (left+right)/2;
       merge_sort(arr,left,mid);
       merge_sort(arr,mid+1,right);
       int i=left,j=mid+1;
       int temp[] = new int[arr.length];
       int k = 0;
       while(i<=mid&&j<=right){
           if(arr[i]<=arr[j]){
               temp[k++] = arr[i++];
           }else {
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
       int mid = left + right >> 1;
       long result = merge_sort_dui(arr,left,mid)+merge_sort_dui(arr,mid+1,right);
       int k = 0;
       int temp[] = new int[1000];
       int i=left,j=mid+1;
       while(i<=mid&&j<=right){
           if(arr[i]<=arr[j]){
               temp[k++] = arr[i++];
           }else{
               result+=mid-i+1;
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
    //双指针算法
    public static int splitWord(int arr[]){
        int res = 0;
        int n = arr.length;
        int s[] = new int[100];
        for(int i=0,j=0;i<n;i++){
            s[arr[i]]++;
            while(s[arr[i]]>1){
                s[arr[j]]--;
                j++;
            }
            res = Math.max(res,i-j+1);
        }
        return res;

    }

    //给定两个升序排序的有序数组 A 和 B，以及一个目标值 x。
    public static void mubiao_he(int a[],int b[],int x){
        int n = a.length;
        int m = b.length;
        for(int i=0,j=m-1;i<n;i++){
            while(j>=0&&a[i]+b[j]>x){
                j--;
            }
            if(a[i]+b[j]==x){
                System.out.printf("%d %d \n",i,j);
                break;
            }
        }
    }

    //请你判断 a 序列是否为 b 序列的子序列。
    public static void panduan_zi(int a[],int b[]){
        int i=0,j=0;
        int m = a.length;
        int n = b.length;
        while(i<m&&j<n){
            if(a[i]==b[j]) i++;
            j++;
        }
        if(i==m){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
    //思路它所对应的lowbit为x&(-x),例如数字7，它的二进制为111，那么它的lowbit为1，数字6的二进制为110，它的lowbit为2
    //获取最右边的1
    public static int lowbit(int x){
        int res = 0;
        while(x!=0){
            x-=(x&-x);
            res++;
        }
        return res;
    }

}

