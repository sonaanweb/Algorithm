class Solution {
    public int solution(int num1, int num2) {
        // 1. 정수 return = int 사용 + 변수명 지정
        /* 2. 식 double 지정, return - int
        double result = (double) num1 / (double) num2;
        return (int) (result * 1000); */
        int answer = (int)(((double) num1 / num2)*1000);
        return answer;
    }
}