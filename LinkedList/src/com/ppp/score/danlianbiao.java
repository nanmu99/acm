package com.ppp.score;

import java.util.Scanner;

/**
 * @auther ppp
 * @create 2021-04-09 19:22
 */
public class danlianbiao {
    public static int N = 10000;
    public static int[] e = new int[N];
    public static int[] ne = new int[N];
    public static int head = -1;
    public static int idx = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            String str = sc.next();
            if(str.equals("H")){
                int x = sc.nextInt();
                insertHead(x);
            }

            else if(str.equals("I")){
                int k = sc.nextInt();
                int x = sc.nextInt();
                insert(k-1,x);
            }else if (str.equals("D")){
                int k = sc.nextInt();
                if(k==0){
                    head = ne[head];
                }else{
                    delete(k-1);
                }
            }
        }
        int i = head;
        while(i!=-1){
            System.out.print(e[i]+" ");
            i = ne[i];
        }

    }

    public static void insert(int k ,int x){
        e[idx] = x;
        ne[idx] = ne[k];//x->next = k->next
        ne[k] = idx;//k->next = x
        idx++;

    }

    public static void insertHead(int x){
        e[idx] = x;//找到一个值
        ne[idx] = head;//先让其指向head
        head = idx;//head =idx
        idx++;//idx++;
    }

    public static void delete(int k){
        ne[k] = ne[ne[k]];
    }
}
