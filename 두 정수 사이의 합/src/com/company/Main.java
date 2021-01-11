package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        long answer;
        Solution s = new Solution();
        answer = s.solution(a,b);
        System.out.println(answer);
    }
}
class Solution{
    public long solution(int a, int b) throws IOException {
        int tmp=0;

        if(a==b){
            return a;
        }
        else if(a>b){
            for(int i=a; i>=b; i--){
                tmp=i+tmp;
            }
            return tmp;
        }
        else
            for(int i=a; i<=b; i++){
                tmp = i + tmp;
            }
            return tmp;
    }
}
