package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(bf.readLine());
        Solution s = new Solution();
        s.solution(n);
    }
}
    class Solution{
        public long solution(long n){
            String s = String.valueOf(n);
            String ansnum= "";
            Long answer;
            char [] arr = new char[s.length()];
            for(int i=0; i<s.length(); i++){
                arr[i] +=s.charAt(i);
            }
            Arrays.sort(arr);
            for(int i = arr.length-1; i>=0; i--){
                ansnum+=arr[i];
                System.out.println(ansnum);
            }
            answer = Long.parseLong(ansnum);

            for(int i:arr){
                System.out.println(i);
            }
            return answer;

        }
    }

