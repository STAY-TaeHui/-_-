package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Solution s = new Solution();
        s.solution(50);
    }
}
class Solution {
    public int solution(int n) {
        /*int count = 1;
        for(int i=2; i<=n; i++){
            for(int j=2; j<i; j++){
                    if(i%j==0){
                        break;
                    }
                    else if(j==i-1){
                        count++;
                    }
            }
        }
        System.out.println(count);*/
       /* int[] arr = new int[n + 1];
        int c = 0;
        for (int i = 2; i <= n; i++) { // 입력받은 숫자까지의 모든 숫자들을 배열에 초기화한다.
            arr[i] = i;
        }

        int Sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= Sqrt; i++) { // 제곱근 까지만 계산
            if (arr[i] == 0) { // 0으로 초기화 되어있는 숫자들은 건너뛴다.
                continue;
            }
            for (int j = i + i; j <= n; j += i) { // 현재 숫자(i)를 제외한 제곱수들은 모두 0으로 초기화.
                arr[j] = 0; // 0이 들어있는 번지는 소수가 아니다.
            }
        }
        for (int i = 2; i <= n; i++) {
            if (arr[i] != 0) {
                c++;
            }
        }*/

        System.out.println(Math.round(Math.sqrt(n)));
        return 1;
    }
}