package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Solution s = new Solution();
        int arr1[][] = {{1,2},{2,3}};
        int arr2[][]= {{3,4},{5,6}};
        int arr3[][] = {{1,2,3,4},{5,6,7,8}};
        int arr4[][] = {{1,2,3,4},{5,6,7,8}};

        s.solution(arr1,arr2);
    }
}
class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int x = arr1.length;
        int y= arr1[0].length;
        int answer[][] = new int[x][y];

        for(int i=0; i<x; i++ ){
            for(int j=0; j<y; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return null;
    }
}