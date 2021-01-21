package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int arr[] = {5,9,7,10};
        int arr2[] = {2,36,1,3};
        int arr3[] = {3,2,6};
        int divisor;

        Scanner sc = new Scanner(System.in);
        System.out.print("divisor : ");
        divisor = sc.nextInt();

        Solution s = new Solution();
        s.solution(arr3, divisor);

        sc.close();
    }
}
class Solution{
    public int[] solution(int[] arr, int divisor){
        int count=0;
        int[] tmp = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            if((arr[i] % divisor)==0){
                tmp[i]=arr[i];
                count++;
            }
        }
        if(count!=0){
            int[] answer = new int[count];
            int temp=0;
            int min=0;
            int srcpos=0;

            for(int i=0; i<tmp.length-1; i++) {//tmp배열 정렬
                min=i;
                for(int j=i+1; j<tmp.length; j++){
                    if(tmp[min]>tmp[j]) {
                        min = j;
                    }
                }
                if(min!=i){
                    temp=tmp[i];
                    tmp[i]=tmp[min];
                    tmp[min]=temp;
                }
                if(tmp[i]==0){
                    srcpos++;
                }
            }

            System.arraycopy(tmp, srcpos, answer, 0, count);

            for(int k : answer){
                System.out.println(k);
            }
            return answer;
        }
        else{//나누어 떨어지는 원소가 없을때
            int[] answer = {-1};
            return answer;
        }
    }
}
