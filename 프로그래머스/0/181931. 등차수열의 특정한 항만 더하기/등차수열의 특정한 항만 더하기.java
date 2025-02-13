class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for (boolean isTrue : included){
            if(isTrue){
                answer += a;
            }
            a += d;
        }
        return answer;
    }
}