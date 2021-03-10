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
        int time=0;     //�귯���� �ð�
        int index=0;    //truck_weights�� �ε���
        int total_weight=0; //�ٸ��� �ö� �� ����
        Queue<Integer> q = new LinkedList<>();
        //offer -> �� �߰�     poll -> �� ��ȯ �� ����
        do{
            time++;
            if(q.size()==bridge_length){ //ť�� ����� �ٸ����̰� �ž�����,
                                        //��,  truck_weights���ҵ��� �� ������ �ʾҴµ� �ٸ��� ��á����
                total_weight-=q.poll(); //ť�� �ϳ� ���ְ� �� ���Կ��� �ϳ� ���ݴϴ�.
            }
            if(total_weight+truck_weights[index] <= weight){ //
                q.offer(truck_weights[index]);
                total_weight += truck_weights[index];
                index++;
            }
            else{
                q.offer(0);
            }
        }while(index<truck_weights.length); //������ truck_weights�� ������ �� ���ٸ� �������ɴϴ�.

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