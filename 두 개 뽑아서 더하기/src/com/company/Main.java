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

        ArrayList<Integer> array = new ArrayList<Integer>();    //Integer타입의 ArrayList생성

        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j< numbers.length; j++){
                if(!array.contains(numbers[i]+numbers[j])){     //numbers[]를 돌면서 바로다음 값과 더해주는데
                    array.add(numbers[i]+numbers[j]);           //만약 array.contains()를 사용하여 더한 수가 array에 존재하지 않으면
                }                                               //array.add()로 그 수를 넣어준다.
            }
        }
        Collections.sort(array);                                //array 정렬

        int [] answer = new int[array.size()];                  //int배열을 반환하기위해 array.size크기만한 배열 생성

        for(int i=0; i<answer.length; i++){
            answer[i] = array.get(i);                           //List array값들을 answer배열에 복사해 준다.
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
