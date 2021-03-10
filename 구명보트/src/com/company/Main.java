package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {70,50,80,50};
        int limit = 100;
        int[] arr2 = {70,50,80,50};
        int limit2 = 100;
        int [] arr3 = {220,210,190,180,150,130,130,100,80,80,70,70,70,60,50,40,40,40};
        int limit3 =240;

        Solution s = new Solution();
        s.solution(arr3, limit3);

    }
}
class Solution{
    public int solution(int [] people, int limit){
        int count=0;
        Arrays.sort(people); // 배열을 오름차순으로 정렬
        for(int i=0, j= people.length-1; i<=j;){
            if(people[i]+people[j] >limit){
                count++;
                j--;
            }
            else{
                count++;
                i++;
                j--;
            }
        }
        System.out.println(count);
        return count;
    }
}