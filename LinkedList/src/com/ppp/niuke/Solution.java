package com.ppp.niuke;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @auther ppp
 * @create 2021-04-01 15:52
 */
public class Solution {
    public static void main(String[] args) {
//        int num = atoi("123");
//        System.out.println(num);
//        int arr[] ={4480,27575,9842,4192,22158,4480,32323,23400,21115,2909,16940,24014,32193,15690,19188,3765,18077,23400,4480,4693,4693,27575,4192,4803,15052,4693,26757,23706,18077,23400,21297,25318,28276,15234,21075,25425,6561,17487,19361,19188,17487,24541,7363,10664,31458,13471,27432,5387,32193,24371,21115,3765,24014,7300,21115,20647,16940,20481,1548,5387,7147,3425,20486,25689,18720,4480,22867,4986,26757,20486,25689,2906,15234,15361,3765,3721,28535,20647,4454,23703,20481,1431,9842,6546,27207,25937,14502,18720,4986,28535,21075,18720,11745,20647,19188,25689,32667,25310,31458,21367,22158,4266,19361,23400,3876,28276,15690,4266,32525,32323,24371,31090,21115,31821,3425,10664,4192,2909,22867,25060,23703,24014,16940,7300,4803,28276,23706,1784,2751,14835,1548,27432,31458,29280,750,3861,27432,10333,28950,10664,4764,6561,1548,2751,27575,10333,32235,4454,256,32235,4330,32655,7363,3721,21075,30784,7147,19132,25425,2078,18720,4986,4454,10486,20486,2751,4266,4192,28950,32667,17487,20481,28535,19132,1431,4330,19361,17487,31821,21367,18720,4764,16940,14835,25937,25318,20647,8762,4986,27207,11745,12462,4266,21075,4764,32667,27432,27432,1431,32525,25689,3876,1784,10664,3721,14010,24541,17487,25060,10486,20486,30784,4480,2078,28276,4266,22867,4803,21367,5387,30784,11896943,2909,3721,4693,4986,4192,29280,32667,7363,4480,24541,25310,27691,20486,11745,32323,32323,4986,4693,2906,750,13471,20486,24371,25310,19132,26757,14502,15234,9842,15234,1784,2909,6561,1431,22158,23400,24541,7554,15052,32525,21115,10486,27691,27432,16940,4192,28535,22867,8762,21297,32667,14010,4192,15052,15690,5387,2909,22158,25310,31821,24014,4803,27691,1431,18077,3861,10333,3861,27207,4454,3765,29280,1431,7300,9842,12462,27207,21367,4330,32193,20481,7363,5387,12462,32323,4803,29280,23703,256,4803,15052,21297,18720,19188,1431,25689,11745,25689,3765,15052,21075,25937,16940,9842,4986,25310,2751,31821,29280,15690,23400,4330,19361,12462,27207,9842,8762,28535,15052,19132,14835,24014,3861,20481,7300,750,6561,31458,10664,25310,14010,3765,19188,4330,20481,32655,32655,15361,3765,15361,3765,14835,4803,28950,2078,25937,15234,25310,25689,20647,32667,21367,12462,15234,22158,3721,10664,4986,14835,7147,15690,4693,3876,32323,2906,12462,28535,14010,25425,15690,10333,15234,27432,26757,29280,24371,15361,15052,1431,256,32323,2751,32667,7554,27575,256,2906,10664,32235,28950,27691,19361,10664,4693,20647,8762,32193,21115,21367,9842,7554,7554,7363,21297,5387,7300,15234,23706,22867,3876,13471,28276,15361,19188,20486,4454,25425,14835,4330,27691,19361,7147,16940,2751,24541,6546,28276,8762,15052,15361,14010,25937,27432,25937,6561,25060,32193,5387,31090,21367,32667,18720,20647,2906,23706,24541,25937,4986,3861,25060,3876,14502,32525,3861,28276,2751,15690,30784,22867,30784,7554,22158,15361,28276,15234,25318,13471,23703,19188,15690,30784,31458,4266,4330,3425,23400,6561,4764,13471,26757,750,18077,22158,27575,18077,31090,7554,24541,28535,24371,6561,31821,32193,18077,2078,21075,2078,19132,20486,19361,1784,7147,25689,7363,6546,14502,9842,10333,21075,22158,32193,25060,20647,32193,27207,4764,19132,27691,11745,22867,4764,12462,32323,5387,6561,6546,19188,32235,27432,31090,7554,7147,10486,4330,8762,28950,11745,16940,19132,24541,24371,24014,7147,6561,3861,1548,4693,27575,25937,31458,1784,13471,14502,18077,21115,10486,32235,19361,23703,21297,4480,32525,14835,25310,11745,2909,3861,10486,24014,23703,27691,2906,15361,3721,10333,23703,28535,18720,7554,10486,30784,29280,28535,4266,4454,31821,10333,2078,23706,32667,21075,256,14010,25060,27207,7363,10664,4480,26757,28950,25318,26757,1784,19132,32655,750,14010,13471,32235,7300,21115,18077,31821,32235,29280,25425,1548,4266,17487,4330,3721,32235,23706,4266,32655,31458,19361,24541,24371,3721,21297,8762,32525,31090,28950,3861,21367,3425,31458,5387,15361,7363,25425,25318,14835,6546,22867,23400,7300,4192,25318,20486,31821,4764,1784,750,6546,32323,24014,18720,17487,2078,27691,14835,25310,21115,27207,32235,23703,17487,31090,30784,6546,8762,4764,7363,11745,31458,2906,31090,32525,30784,12462,3876,27575,4454,25060,32655,13471,25425,1548,256,6546,25060,256,20647,15052,4454,25425,2906,23703,750,1784,29280,4803,14502,2909,19132,21367,20481,1548,2909,1548,4764,3425,31821,23706,25689,2078,32655,3876,7300,16940,27575,21297,3425,2751,10333,22867,24371,2909,1431,256,25425,32193,10333,25318,7554,2751,11745,17487,21297,14010,3765,25318,32525,7300,26757,4480,25060,21297,32655,750,14010,22158,21075,3425,7147,23706,32655,1784,2906,25937,25318,10486,28950,19188,4454,20481,28950,3876,32525,27575,14502,14502,20481,23400,8762,4693,7147,27207,750,27691,14502,1548,256,12462,3425,3876,28276,24371,15690,31090,24014,18077,23706,3425,6546,10486,2078,4803,3721,4192,9842,31090,26757,13471};
//        int i = foundOnceNumber(arr, 3);
//        System.out.println(i);
//        String arr[] = {"abca","abc","abca","abc","abcc"};
//        String s = longestCommonPrefix(arr);
//        System.out.println(s);
//        int kmp = kmp("ababab", "abababab");
//        System.out.println(kmp);

//        int arr[] = {2,2,3,4,3};
//        int i = maxLength(arr);
//        System.out.println(i);
//        int arr[] = {1,2,2,3,5};
//        int i = splitWord(arr);
//        System.out.println(i);

        //快速排序
        int arr[] = {2,3,4,5,6,1};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
//        merge_sort(arr,0,arr.length-1);
//        System.out.println(Arrays.toString(arr));
//        int i = quick_Sort(arr, 0, arr.length - 1, 4);
//        System.out.println(i);
//        long l = merge_sort_n(arr, 0, arr.length - 1);
//        System.out.println(l);
        //shu_3(1000.00);
//        int n[] = {1,2,4,7};
//        int m[] = {3,4,6,8,9};
//        mubiao_he(n,m,6);
//        panduan_zi(n,m);


    }
    public static int atoi (String str) {
        // write code here
        if(str==null||str.trim().length()<1){
            return 0;
        }
        char arr[] = str.trim().toCharArray();
        int sign = 1,index = 0;
        //判断正负号
        if(arr[0]=='+'){
            index ++;
        }
        if(arr[0]=='-'){
            sign = -1;
            index ++;
        }
        int num = 0;
        for(int i=index;i<arr.length;i++){
            if(arr[i]-'0'>=0&&arr[i]-'9'<=0){
                num = 10*num+arr[i]-'0';
            }
        }
        return num*sign;
    }

    public static int foundOnceNumber (int[] arr, int k) {
        // write code here
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int num : arr) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//        for (int num : arr) {
//            if (map.get(num) == 1) {
//                return num;
//            }
//        }
//        return -1;
//
//    }
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for (int num:arr){
            if(map.get(num)==1){
                return num;
            }
        }
        return -1;
    }

    public static String longestCommonPrefix (String[] strs) {
        if(strs==null||strs.length==0){
            return "";
        }
        Arrays.sort(strs);//{0="abc",1="abc",2="abca",3="abca",4="abcc"}
        String res=strs[0];//res=abc
        for(int i=1;i<strs.length&&res.length()>=0;i++){
            if(!strs[i].startsWith(res)){
                res=res.substring(0,res.length()-1);
                i=1;
            }
        }
        return res;
    }

    public static int kmp (String S, String T) {
        int time = 0;
        int longLen = T.length();
        int shortLen = S.length();
        for(int i=0;i<=longLen-shortLen;i++){
            if(S.equals(T.substring(i,shortLen+i))){
                time++;
            }
        }
        return time;
    }

    public static int maxLength (int[] arr) {
        // write code here
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        return map.size();
    }
    //给定一个长度为 n 的整数序列，请找出最长的不包含重复的数的连续区间，输出它的长度
    public static int splitWord(int arr[]){
        int res = 0;
        int n = arr.length;
        int s[] = new int[n];
        for(int i =0,j=0;i<n;i++){
            s[arr[i]]++;
            while (s[arr[i]]>1){
                s[arr[j]]--;
                j++;
            }
            res = Math.max(res,i-j+1);
        }
        return res;
   }


    //快速排序
    public static void quickSort(int[] arr,int l ,int r){

        if(l>=r){
            return;
        }

        int i = l-1,j=r+1;
        int x = arr[(l+r)/2];
        while(i<j){
            while(arr[++i]<x);
            while(arr[--j]>x);
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        quickSort(arr,l,j);
        quickSort(arr,j+1,r);


    }

    public static int quick_Sort(int arr[], int l, int r, int k) {
       if(l>=r){
           return arr[l];
       }
       int i=l-1,j=r+1;
       int x = arr[(l+r)/2];
       while (i<j){
           while(arr[++i]<x);
           while (arr[--j]>x);
           if(i<j){;
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
           }
       }
       int sl = j-l+1;
       if(sl>k){
           return quick_Sort(arr,i,j,k);
       }
       return quick_Sort(arr,j+1,r,k-sl);
    }


    public static void merge_sort(int arr[],int left,int right){
       if(left>=right){
           return;
       }

       int mid = left + right >> 1;
       merge_sort(arr,left,mid);
       merge_sort(arr,mid+1,right);
       int i=left,j=mid+1;
       int k=0;
       int temp[] = new int[arr.length];
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

    //给定一个长度为 n 的整数数列，请你计算数列中的逆序对的数量。
    public static long merge_sort_n(int arr[],int l,int r){
       if(l>=r){
           return 0;
       }
       int mid = (l+r)/2;
       long result = merge_sort_n(arr,l,mid)+merge_sort_n(arr,mid+1,r);
       int i=l,j=mid+1;
       int temp[] = new int[arr.length];
       int k = 0;
       while(i<=mid&&j<=r){
           if(arr[i]<=arr[j]){
               temp[k++] = arr[i++];
           }else{
               result += mid-i+1;
               temp[k++] = arr[j++];
           }
       }
       while(i<=mid){
           temp[k++] = arr[i++];
       }

       while (j<=r){
           temp[k++] = arr[j++];
       }
       for(i=l,j=0;i<=r;i++,j++){
           arr[i] = temp[j];
       }
       return result;
    }

    //数的三次方根
    public static void shu_3(double arr){
        double l = -10000;
        double r = 10000;
        while(r-l>1e-8){
            double mid = (l+r)/2;
            if(mid*mid*mid<arr){
                l = mid;
            }else{
                r = mid;
            }
        }
        System.out.printf("%.6f\n",l);
    }

    //给定两个升序排序的有序数组 A 和 B，以及一个目标值 x。
    public static void mubiao_he(int a[],int b[],int x){
        int n = a.length;
        int m = b.length;
        for(int i=0,j=m-1;i<n;i++){
            while (j>=0 && a[i]+b[j]>x){
                j--;
            }
            if(a[i]+b[j]==x){
                System.out.printf("%d %d\n",i,j);
                break;
            }
        }
    }

    //请你判断 a 序列是否为 b 序列的子序列。
    public static void panduan_zi(int a[],int b[]){
        int i=0,j=0;
        int n = a.length;
        int m = b.length;
        while(i<n&&j<m){
            if(a[i]==b[j]) i++;
            j++;
        }
        if(i==n){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }



}
