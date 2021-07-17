package com.ppp.dynamic;

/**
 * @auther ppp
 * @create 2021-03-27 16:10
 */
public class KnapsackProblem {
    public static void main(String[] args) {
        int w[]={1,4,3};//物品的重量
        int val[] ={1500,3000,2000};////物品的价值
        int m = 4;//背包的容量
        int n = val.length;//物品的个数
        //创建二维数组
        int v[][] = new int[n+1][m+1];
        //为了记录放入商品的情况，我们定一个二维数组
        int[][] path = new int[n+1][m+1];

        //初始化第一行和第一列, 这里在本程序中，可以不去处理，因为默认就是 0
        for(int i=0;i<v.length;i++){
            v[i][0] = 0;//将第一列设置为 0
        }

        for(int i=0;i<v[0].length;i++){
            v[0][i]=0;//将第一行设置 0
        }

        for(int i=1;i<v.length;i++){
            for(int j=1;j<v[0].length;j++){
                if(w[i-1]>j){
                    v[i][j]=v[i-1][j];
                }else{
                    //v[i][j]=Math.max(v[i-1][j],val[i-1]+v[i-1][j-w[i-1]]);
                    if(v[i - 1][j] < val[i - 1] + v[i - 1][j - w[i - 1]]) {
                        v[i][j] = val[i - 1] + v[i - 1][j - w[i - 1]];
                        //把当前的情况记录到 path
                        path[i][j] = 1;
                    } else {
                        v[i][j] = v[i - 1][j];
                    }
                }
            }
        }


        for(int row[]:v){
            for (int data:row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }

        int i = path.length - 1; //行的最大下标
        int j = path[0].length - 1; //列的最大下标
        while(i > 0 && j > 0 ) { //从 path 的最后开始找
            if(path[i][j] == 1) {
                System.out.printf("第%d 个商品放入到背包\n", i);
                j -= w[i-1]; //w[i-1]
            }
            i--;
        }
    }

}
