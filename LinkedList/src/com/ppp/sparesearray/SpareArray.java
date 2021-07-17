package com.ppp.sparesearray;

/**
 * @auther ppp
 * @create 2021-03-22 10:47
 */
public class SpareArray {
    public static void main(String[] args) {
        int chess[][] = new int[11][11];
        chess[1][2] = 1;
        chess[2][3] = 2;
        System.out.println("稀疏数组是");
        for(int[] row:chess){
            for(int data: row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }

        int sum = 0;
        for(int i = 0;i<chess.length;i++){
            for (int j = 0;j<chess[i].length;j++){
                if(chess[i][j]!=0){
                    sum += 1;
                }
            }
        }
        //System.out.println("sum="+sum);
        System.out.println("稀疏矩阵");
        int spareArray[][] = new int[sum+1][3];
        spareArray[0][0] = chess.length;
        spareArray[0][1] = chess.length;
        spareArray[0][2] = sum;

        int count = 0;
        for(int i =0;i<chess.length;i++){
            for(int j=0;j<chess[i].length;j++){

                if(chess[i][j]!=0){
                    count+=1;
                    spareArray[count][0]=i;
                    spareArray[count][1]=j;
                    spareArray[count][2]=chess[i][j];
                }
            }
        }

        for(int i=0;i<spareArray.length;i++){
            System.out.printf("%d\t%d\t%d\t\n",spareArray[i][0],spareArray[i][1],spareArray[i][2]);
        }
        System.out.println();
        int chessArr2[][] = new int[spareArray[0][0]][spareArray[0][1]];
        for(int i =1;i<spareArray.length;i++){
            chessArr2[spareArray[i][0]][spareArray[i][0]] = spareArray[i][2];
        }

        System.out.println("转换完成");
        for(int[] row:chess){
            for(int data: row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }

    }




}
