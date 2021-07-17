package com.ppp.score;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @auther ppp
 * @create 2021-04-09 19:48
 */
public class shuangxiang {
    public static int N = 10000;
    public static int[] l= new int[N];
    public static int[] r = new int[N];
    public static int[] e = new int[N];
    public static int idx;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(in.readLine());
        init();
        while(m-->0){
            String[]arr=in.readLine().split(" ");
            String op=arr[0];
            if(op.equals("L")){
                int x=Integer.parseInt(arr[1]);
                add(0,x);
            }else if(op.equals("R")){
                int x=Integer.parseInt(arr[1]);
                add(l[1],x);
            }else if(op.equals("D")){
                int k=Integer.parseInt(arr[1]);
                delete(k+1);
            }else if(op.equals("IL")){
                int k=Integer.parseInt(arr[1]);
                int x=Integer.parseInt(arr[2]);
                add(l[k+1],x);
            }else{
                int k=Integer.parseInt(arr[1]);
                int x=Integer.parseInt(arr[2]);
                add(k+1,x);
            }

        }
        for(int i=r[0];i!=1;i=r[i]) System.out.print(e[i]+" ");
    }

    public static void init(){
        r[0] = 1;
        l[1] = 0;
        idx=2;
    }

    public static void add(int k,int x){
        e[idx] = x;
        r[idx] = r[k];
        l[idx] = k;
        l[r[k]] = idx;
        r[k] = idx;
        idx++;
    }

    public static void delete(int k){
        l[r[k]] = l[k];
        r[l[k]] = r[k];

    }
}
