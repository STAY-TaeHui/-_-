package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
       Solution s = new Solution();
       s.solution("a123");
       s.solution("1234");
    }
}
class Solution {
    public boolean solution(String s) {
int tmp;

if (s.length()==4|| s.length()==6){
    try
    {
        tmp=Integer.parseInt(s);
        return true;
    }
    catch (Exception e){
        return false;
    }
}
else
    return false;

    }
}