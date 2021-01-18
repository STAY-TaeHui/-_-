package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String str = "-1234";
        Solution s = new Solution();
        s.solution(str);
    }
}
class Solution{
    public int solution(String s){
        int answer = 0;
        char op = s.charAt(0);

        switch (op) {
            case '+':
                System.out.println("This is 양수");
                answer = Integer.parseInt(s);

                break;
            case '-':
                System.out.println("This is 음수");
                answer = Integer.parseInt(s);
                break;
            default:
                System.out.println("This is DEFAULT");
                answer = Integer.parseInt(s);
        }
        System.out.println(answer+1);
        return answer;
    }
    public int op_delete(String s){
        String tmp_arr="";
        for(int i=1; i<s.length(); i++){
            tmp_arr+=s.charAt(i);
        }
        return Integer.parseInt(tmp_arr);
    }
}
