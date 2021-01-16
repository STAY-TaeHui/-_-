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
        int i,j,k;
        int x=commands.length;
        int[] tmp={};
        int[] answer = new int[x];

        for(int a=0; a<x; a++){
            int b= 0;
            int index=0;
            i=commands[a][b]-1;
            j=commands[a][b+1]-1;
            k=commands[a][b+2]-1;
            System.out.printf("%d, %d, %d\n",i,j,k);

            tmp = init_arr(i,j);
            for(; i<=j; i++){
                tmp[index]=array[i];
                index++;
            }
            Arrays.sort(tmp);

            answer[a]=tmp[k];

            for (int test:tmp) {//잘 나오는지 확인
                System.out.print(test+" ");
            }
            System.out.println(); System.out.println();

            //초기화
            index=0;


        }
        for(int ans:answer){
            System.out.println("정답은");
            System.out.print(ans);
        }
        return answer;
    }
    public int[] init_arr(int a, int b){
        int[] tmp = new int [b-a+1];
        for(int i=0; i<tmp.length; i++){
            tmp[i] = 0;
        }
        return tmp;
    }
}