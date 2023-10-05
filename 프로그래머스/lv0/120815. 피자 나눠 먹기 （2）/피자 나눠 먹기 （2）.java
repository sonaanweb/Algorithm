class Solution { 
    // (피자 여섯조각) n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면
    // 최소 몇판을 시켜야 하는지 반환
    public int solution(int n) { // n = 피자 나눠 먹을 사람의 수
        int answer = 0;
        
        for(int i = 1; i<=n; i++){ // i = 피자 수
            if(i*6%n ==0){
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}