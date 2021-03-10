package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Solution s = new Solution();
        int[] arr = {10};
        s.solution(100,100,arr);
    }
}
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time=0;     //흘러가는 시간
        int index=0;    //truck_weights의 인덱스
        int total_weight=0; //다리에 올라간 총 무게
        Queue<Integer> q = new LinkedList<>();
        //offer -> 값 추가     poll -> 값 반환 및 제거
        do{
            time++;
            if(q.size()==bridge_length){ //큐의 사이즈가 다리길이가 돼었을때,
                                        //즉,  truck_weights원소들이 다 들어가지도 않았는데 다리가 꽉찼을때
                total_weight-=q.poll(); //큐를 하나 빼주고 총 무게에도 하나 빼줍니다.
            }
            if(total_weight+truck_weights[index] <= weight){ //
                q.offer(truck_weights[index]);
                total_weight += truck_weights[index];
                index++;
            }
            else{
                q.offer(0);
            }
        }while(index<truck_weights.length); //조건은 truck_weights의 값들이 다 들어갔다면 빠져나옵니다.

        if(time< bridge_length){
            time+= bridge_length-time;
        }
        while(q.peek()!=null){
            time++;
            q.remove();
        }
        System.out.println(time);
        return time;
    }
}