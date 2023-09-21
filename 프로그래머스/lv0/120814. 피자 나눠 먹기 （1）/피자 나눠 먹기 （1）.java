class Solution {
    public int solution(int n) { // 사람의 수 n 피자는 한판에 7조각
// 7의 배수일 때 : 7로 나눈 값 만큼의 피자 필요
// 7의 배수가 아닐 때 : 7로 나눈 값 + 1
    int answer = 0;
        answer = (n%7 == 0) ? n/7 : n/7 + 1;
        
        return answer;
    }
}