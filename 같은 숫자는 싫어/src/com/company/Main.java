package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {1,1,3,3,0,1,1};
        int[] arr2 = {4,4,4,3,3};
        int[] arr3 = {1, 1, 2, 3, 2, 3, 4};
        Solution S = new Solution();
        S.solution(arr3);
    }
}
class Solution{
    public int[] solution (int[] arr){
        int count=1;

        for(int i=0; i<arr.length-1;){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]!=arr[j]){
                    i=j;
                    count++;
                    break;
                }
                else if(j== (arr.length-1) && i== (arr.length-2)){
                    i++;
                }
            }
        }

        int[] answer=new int [count];

        for(int i=0,index=0; index<count; index++){
            answer[index]=arr[i];
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]!=arr[j]){
                    i=j;
                    break;
                }
            }
        }
//        for(int i:answer){
//            System.out.print(i+" ");
//        }
        return answer;
    }
}