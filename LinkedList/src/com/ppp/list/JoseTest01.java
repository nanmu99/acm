package com.ppp.list;

import java.util.LinkedList;

/**
 * @auther ppp
 * @create 2021-03-20 22:02
 */
public class JoseTest01 {
    public static void main(String[] args) {
        int u = ysf(5,2);
        System.out.println(u);
    }

    public static int ysf (int n, int m) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int i=1;i<=n;i++){
            list.add(i);
        }
        int curr = 0;
        while(list.size()>1){
            int size = list.size();
            int pos = (curr+m-1)%size;
            list.remove(pos);
            curr = pos%(size-1);
        }
        return list.get(0);

    }


}
