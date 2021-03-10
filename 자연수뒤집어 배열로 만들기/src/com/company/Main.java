package com.company;

public class Main {
    public static void main(String[] args) {
	// write your code here
        long n=12345;
        long n1=3456234;
        long n2=10000;


        Solution s = new Solution();
        s.solution(n2);

    }

}
class Solution{
    public int[] solution(long n){
        //3 4 5 6 2 3 4
        //
        int[] answer;
        long copyn = n;
        int i=0;

        while(copyn!=0){
            copyn = copyn/10;
            i++;
        }
            answer = new int[i];
            for(int a=0; a<i; a++){
                answer[a] = (int)(n%10);
                System.out.println(n%10);
                n=n/10;
            }

        System.out.println("answer : ");
            for(int j : answer){
                System.out.print(j+" ");
            }
        return answer;

    }
}
