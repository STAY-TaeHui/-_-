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
            int index=0;
            i=commands[a][0]-1;
            j=commands[a][1]-1;
            k=commands[a][2]-1;

            tmp = init_arr(i,j);//i에서 j만큼의 임시배열 생성함수 호출

            for(; i<=j; i++){
                tmp[index]=array[i];//tmp임시배열에 i부터 j까지 대입
                index++;
            }
            Arrays.sort(tmp);//tmp 오름차순으로 정렬

            answer[a]=tmp[k];//tmp k번째의 수를 answer에 대입
        }
        for(int t : answer){
            System.out.print(t);
        }
        return answer;
    }
    public int[] init_arr(int a, int b){//임시배열 생성 후 반환
        int[] tmp = new int [b-a+1];
        for(int i=0; i<tmp.length; i++){
            tmp[i] = 0;
        }
        return tmp;
    }
}