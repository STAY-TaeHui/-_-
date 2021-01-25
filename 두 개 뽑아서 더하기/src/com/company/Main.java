package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {2,1,3,4,1};
        int [] arr2 = {5,0,2,7};
        Solution s = new Solution();
        s.solution(arr);

    }
}
class Solution{
    public int[] solution(int[] numbers){

        ArrayList<Integer> array = new ArrayList<Integer>();

        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j< numbers.length; j++){
                if(!array.contains(numbers[i]+numbers[j])){
                    array.add(numbers[i]+numbers[j]);
                }
            }
        }
        Collections.sort(array);

        int [] answer = new int[array.size()];

        for(int i=0; i<answer.length; i++){
            answer[i] = array.get(i);
        }
           /* //결과값 확인
        System.out.print(array);    //중복제거 전

        for(int i: answer){
            System.out.print(i + " ");// 정렬 후
        }
*/
        return answer;
    }
}
