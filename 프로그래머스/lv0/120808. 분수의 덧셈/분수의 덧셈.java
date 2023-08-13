class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 결과값을 담을 배열의 길이(요소) 선언
        int[] answer = new int[2];
        
        // 분자와 분모를 순서대로 담을 배열
        // 분자 (numer1)(denom2)+(numer2)(denom1)
        answer[0] = numer1 * denom2 + numer2 * denom1;
        // 분모 (denom1)(denom2)
        answer[1] = denom1 * denom2;
        
        // 최소값
        // Math.min(파라미터 1, 파라미터 2); 작은 값 리턴
        // Math.max(파라미터 1, 파라미터 2); 큰 값 리턴
        int min = Math.min(answer[0], answer[1]);
        int max = 1;
        
        // 약분할 수 최대값 찾기(기약분수를 위함)
        for(int i=1; i<=min; i++){
            if(answer[0] % i == 0 && answer[1] % i == 0){
                max = i;
            }
        }
        
        // 분수 약분
        answer[0] /= max;
        answer[1] /= max;
        
        return answer;
    }
}