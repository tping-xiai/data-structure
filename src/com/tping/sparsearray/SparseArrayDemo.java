package com.tping.sparsearray;

/**
 * 稀疏数组
 *
 */
public class SparseArrayDemo {

    private static final int DEFAULT_COUNT = 10;

    public static void main(String[] args){

        // 定义棋盘
        int[][] sparseArr = new int[DEFAULT_COUNT][DEFAULT_COUNT];
        /**
         * 默认没有落子：0
         * 默认白子位：1
         * 默认黑子位：2
         */
        sparseArr[2][3] = 1;
        sparseArr[3][4] = 2;
        sparseArr[2][4] = 1;
        sparseArr[2][5] = 2;

        // 遍历棋盘
        printArray(sparseArr, "当前棋盘情况：");

        // 创建稀疏数组
        int[][] sparseArray = createSparseArray(sparseArr);

        // 复盘棋盘
        resetBoardArray(sparseArray);
    }

    private static void resetBoardArray(int[][] sparseArr) {
        // 创建棋盘
        int[][] boardArr = new int[sparseArr[0][0]][sparseArr[0][1]];
        for (int i = 1; i <= sparseArr[0][2]; i++) {
            boardArr[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
        }

        printArray(boardArr, "复盘棋盘情况：");
    }

    private static int[][] createSparseArray(int[][] boardArr) {
        // 遍历落子个数
        int sum = 0;
        for (int i = 0; i < boardArr.length; i++) {
            for (int j = 0; j < boardArr[0].length; j++) {
                if( boardArr[i][j] != 0 ){
                    sum++;
                }
            }
        }

        int[][] sparseArr = new int[sum + 1][3];
        sparseArr[0][0] = boardArr.length;
        sparseArr[0][1] = boardArr[0].length;
        sparseArr[0][2] = sum;

        int count = 0;
        for (int i = 0; i < boardArr.length; i++) {
            for (int j = 0; j < boardArr[0].length; j++) {
                if( boardArr[i][j] != 0 ){
                    count++;
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = boardArr[i][j];
                }
            }
        }

        printArray(sparseArr, "稀疏数组结构：");
        return sparseArr;
    }

    private static void printArray(int[][] sparseArr, String desc) {
        System.out.println("=======================> " + desc + " <=======================");
        for (int i = 0; i < sparseArr.length; i++) {
            for (int j = 0; j < sparseArr[0].length; j++) {
                System.out.print(sparseArr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
