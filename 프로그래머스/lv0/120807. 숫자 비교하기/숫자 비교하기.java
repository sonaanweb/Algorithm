class Solution {
    public int solution(int num1, int num2) {
        // if 문 사용
        int answer = 0; // answer 값 초기화
        if(num1 == num2)
            answer = 1;
        else
            answer = -1;
        return answer;
    }
}