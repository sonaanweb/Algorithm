class Solution {
    // 피자 한판을 2조각~10조각까지 원하는 수로 잘라준다
    // n명의 사람이 최소 한 조각 이상 먹으려면 최소 몇판의 피자를 시켜야 하는지
    public int solution(int slice, int n) {
        int answer = 0;
        
        // Math.ceil 소수점 올림 함수 3 / 2 = 1.5 -> 2
        // double 형변환 후 나눈 결과를 올림함수 사용
        answer = (int) Math.ceil((double) n/slice);
        
        return answer;
    }
}