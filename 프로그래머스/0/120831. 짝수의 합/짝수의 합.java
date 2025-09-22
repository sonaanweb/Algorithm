class Solution {
    public int solution(int n) {
        int answer = 0;
    
        for(int i = 1; i <= n; i++){ // n이하 정수
            if(i % 2 == 0){ // i가 짝수일 때 합산
                answer += i;
            }
        }
        
        return answer;
    }
}