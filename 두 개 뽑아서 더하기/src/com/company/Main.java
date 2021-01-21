package com.company;

import java.util.ArrayList;

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
        int[] answer={};
        ArrayList array = new ArrayList();

        for(int i=0; i<numbers.length-1; i++){
            for(int j=i; j< numbers.length; j++){
                array.add(numbers[i]+numbers[j]);
            }
        }
        System.out.print(array);
        return answer;
    }
}
