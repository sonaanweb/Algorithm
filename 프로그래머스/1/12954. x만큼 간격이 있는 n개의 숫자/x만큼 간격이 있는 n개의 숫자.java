// x부터 시작해 x씩 증가하는 숫자 n개
class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n]; // 길이 n 배열
        for(int i=0; i<n; i++){
            answer[i] = (long)x * (i+1); // x,2x.. (n~n-1)
        }
        return answer;
    }
}