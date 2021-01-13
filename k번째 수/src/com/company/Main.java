package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
	// write your code here
        int []array = {1, 5, 2, 6, 3, 7, 4};
        int [][] commands = {{2, 5, 3}, {4,4,1},{1,7,3}};


        Solution s = new Solution();
        s.solution(array, commands);


    }
}

class Solution{
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        int []tmp= new int[array.length];
        int i,j,k;

        int x=commands.length;
        for(int a=0; a<x; a++){
            int b= 0;
            int index=0;
            i=commands[a][b];
            j=commands[a][b+1];
            k=commands[a][b+2];

//            for(; i<=j; i++){
//                tmp[i]=array[i];
//                index++;
//            }
//            Arrays.sort(tmp);
//            for (int test:tmp) {
//                System.out.println(test);
//            }


            System.out.printf("%d, %d, %d\n",i,j,k);
        }
        return tmp;
    }
}