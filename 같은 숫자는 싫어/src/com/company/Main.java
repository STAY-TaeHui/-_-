package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {1,1,3,3,0,1,1};
        int[] arr2 = {4,4,4,3,3,};
        Solution S = new Solution();
        S.solution(arr);
    }
}
class Solution{
    public int[] solution (int[] arr){
        int[] answer=new int [arr.length];
        int ans_len=0;
        int tmp=0;

        for(int i=0; i<arr.length-1; i++){
            for(int j=1; j<arr.length; j++){
                if(arr[i]==arr[j]){

                }
            }
        }

        for(int i: answer){
            System.out.println(i);
        }
        return answer;
    }
}