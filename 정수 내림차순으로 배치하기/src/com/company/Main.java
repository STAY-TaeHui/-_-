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
            String s = Long.toString(n);
            String[]  arr = s.split("");
            //String answer="";
            long answer;
            Arrays.sort(arr, Collections.reverseOrder());
            String tmp = String.join("",arr);
            answer = Long.parseLong(tmp);

            System.out.println((answer));
            return answer;

        }
    }

