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
        for (int i = 2; i <= n; i++) { // �Է¹��� ���ڱ����� ��� ���ڵ��� �迭�� �ʱ�ȭ�Ѵ�.
            arr[i] = i;
        }

        int Sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= Sqrt; i++) { // ������ ������ ���
            if (arr[i] == 0) { // 0���� �ʱ�ȭ �Ǿ��ִ� ���ڵ��� �ǳʶڴ�.
                continue;
            }
            for (int j = i + i; j <= n; j += i) { // ���� ����(i)�� ������ ���������� ��� 0���� �ʱ�ȭ.
                arr[j] = 0; // 0�� ����ִ� ������ �Ҽ��� �ƴϴ�.
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