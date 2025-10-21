class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n); // 문자열로 변환
        int len = str.length();     // 자리 수
        int[] answer = new int[len];
        
        for (int i = 0; i < len; i++){
            answer[i] = str.charAt(len - 1 - i) - '0';
        }
        
        return answer;
    }
}