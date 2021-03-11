package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String a = "1924";int i=2;
        String a1 = "1231234";int i1=3;
        String a2 = "4177252841";int i2=4;
        Solution s  = new Solution();
        s.solution(a1,i1);
    }
}
class Solution {
    public String solution(String number, int k) {
        String answer = "";
        List<String> arr = new ArrayList<>(Arrays.asList(number.split("")));
        int max =0;
        List<String> temp = new ArrayList<>(arr);
        int count=0;

        max = temp.indexOf(Collections.max(temp)); //최대값이 있는 인덱스
//        while(arr.size()-k-1 <max){
//            temp.remove(max);
//            max=temp.indexOf(Collections.max(temp));
//        }
        while(arr.size()!=k) {
            if (max > k) {
                temp.remove(max);
                max=temp.indexOf(Collections.max(temp));
            } else {
                for (max = max - 1; max >= 0; max--) {
                    arr.remove(max);
                }
                for (int i = 0; i < arr.size(); i++) {
                    if(arr.size()==arr.size()-k){
                        break;
                    }
                    if (Integer.parseInt(arr.get(i)) > Integer.parseInt(arr.get(i + 1)) && Integer.parseInt(arr.get(i + 1)) < Integer.parseInt(arr.get(i + 2))) {
                        arr.remove(i + 1);
                    }
                }
            }
        }
        for(String s : arr){
            System.out.println(s);
        }

        return answer;
    }
//    public String max(List<String> temp, List<String> arr){
//    }
}