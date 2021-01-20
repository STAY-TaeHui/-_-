package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //테스트 케이스 3가지
        int[] arr = {1,1,3,3,0,1,1};
        int[] arr2 = {4,4,4,3,3};
        int[] arr3 = {1, 1, 2, 3, 2, 3, 4};
        Solution S = new Solution();
        S.solution(arr3);
    }
}
class Solution{
    public int[] solution (int[] arr){
        int count=1;    //answer배열의 크기를 결정할 카운트

        for(int i=0; i<arr.length-1;){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]!=arr[j]){     //arr[i]와 arr[j]를 비교해서 같은 숫자가 아니면
                    i=j;                //i를 j 인덱스로 바꾸고
                    count++;            //count를 더해준다. (
                    break;              //break로 j가 메인인 for문을 빠져나옴.
                }
                else if(j== (arr.length-1) && i== (arr.length-2)){      //for문에 증감식이 없기떄문에 마지막 직전 인덱스를
                                                                        //체크하기 위함.
                    i++;                                                //i가 마지막 직전 인덱스이고, 위에서 i=j를 해주지 못했을때
                }                                                       //강제로 i를 늘려  i가 메인인 for문을 종료시킴
            }
        }

        int[] answer=new int [count];       //count크기는 answer배열을 만들어줌

        for(int i=0,index=0; index<count; index++){     //for문형식은 같고
            answer[index]=arr[i];                       //answer배열에 연속되고,중복되는 값은 빼고 처음 보는 숫자를 answer배열에 넣어줌
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]!=arr[j]){
                    i=j;
                    break;
                }
            }
        }
//        for(int i:answer){
//            System.out.print(i+" ");
//        }
        return answer;
    }
}