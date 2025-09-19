class Solution {
    public int solution(int num1, int num2) {
        // 1. 문제 => num1 / num2 * 1000
        // 2. 3 / 2 * 1000 = 1500 (소수 부분이 버려지면 안 됨)
        // return (int)(((double) num1 / num2) * 1000);
        
        return (num1 * 1000) / num2;
        
        // 정수 곱셈의 특성(나눗셈과 달리 정확히 곱해짐) 활용한 풀이법
    }
}