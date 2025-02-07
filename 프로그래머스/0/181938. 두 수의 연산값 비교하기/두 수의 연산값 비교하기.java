class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int ab = Integer.parseInt(""+a+b);
        int tab = 2 * a * b;
        if(ab == tab){
            return ab;
        }
        answer = ab > tab ? ab : tab;
        return answer;
    }
}