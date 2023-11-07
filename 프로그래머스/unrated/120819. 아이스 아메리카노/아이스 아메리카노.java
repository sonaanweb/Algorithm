// 아메리카노 1잔 = 5500 , 머쓱이 돈 = money - 최대 잔 수, 남는 돈 반환 배열 2개
// money = money / 5500
class Solution {
    public int[] solution(int money) {
        //int[] answer = {};
        int[] answer = new int[2]; // 배열 생성+선언
        answer[0] = money / 5500; // 최대 잔 수
        answer[1] = money % 5500; // 나머지
        
        return answer;
    }
}