package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int arr[] = {5,9,7,10};         //테스트 케이스들
        int arr2[] = {2,36,1,3};
        int arr3[] = {3,2,6};
        int divisor;

        Scanner sc = new Scanner(System.in);
        System.out.print("divisor : ");     //divisor를 입력받기
        divisor = sc.nextInt();

        Solution s = new Solution();
        s.solution(arr3, divisor);

        sc.close();
    }
}
class Solution{
    public int[] solution(int[] arr, int divisor){
        int count=0;                            //배열의 크기를 결정할 count
        int[] tmp = new int[arr.length];        //임시배열 tmp[]의 크기를 arr[]와 같게 선언
        for(int i=0; i<arr.length; i++){        //arr[]의 원소들을 각각 돌면서
            if((arr[i] % divisor)==0){          //각 원소가 divisor로 나눠 떨어지게 되면
                tmp[i]=arr[i];                  //tmp[]임시배열에 원소를 대입해주고
                count++;                        //count를 올려준다.
            }
        }
        if(count!=0){                           //count가 0이 아니라면
            int[] answer = new int[count];      //count크기의 배열을 선언해준다.
            int temp=0;                         //정렬을 위한 임시변수
            int min=0;                          //선택정렬을 위한 최소 인덱스 변수
            int srcpos=0;                       //배열복사할 때 위치를 결정할 변수

            for(int i=0; i<tmp.length-1; i++) {//tmp배열 선택정렬
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
                if(tmp[i]==0){                  //위에서 tmp[]배열을 초기화해주지 않았기 때문에 0이 들어가있다.
                    srcpos++;                   //입력되는 배열의 원소는 모두 자연수이기 때문에 0을 빼주기 위함의 카운트변수이다.
                }                               //오름차순으로 정렬되어 있어 0은 모두 앞쪽으로 위치해 있기 때문에 0을 제외한 나머지 원소만 복사 할 수있다.
            }

            System.arraycopy(tmp, srcpos, answer, 0, count); //System.arraycopy()메소드를 이용하여
                                                                    //복사할 원본 배열과 어디부터 복사할지 위치, 어떤배열에 복사할지를 정해준다.
                                                                    //원본배열 tmp[]의 srcpos인덱스부터 복사, 이름은 answer로 count크기만큼 생성.
            for(int k : answer){            //결과값 체크
                System.out.println(k);
            }
            return answer;
        }
        else{                           //나누어 떨어지는 원소가 없을때
            int[] answer = {-1};
            return answer;
        }
    }
}
