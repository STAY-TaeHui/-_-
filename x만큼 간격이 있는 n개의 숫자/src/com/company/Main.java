package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Solution s = new Solution();
        s.solution(10000000,1000);
    }
}
class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for(int i=1; i<=n; i++){
            answer[i-1] = x*(long)i;
        }

        for(long j : answer){
            System.out.print(j+" ");
        }
        return answer;
    }
}