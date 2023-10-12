class Solution {
    // 정수 n이 매개변수로 주어질 때,
    // n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성
    // 제한 사항 추가 1 <= n <= 100
    public int[] solution(int n) {
        int[] arr = new int[100]; // 길이가 100인 인덱스 생성
        int index = 0; // 인덱스 변수
        
        // arr.length는 항상 길이가 정해져있는 배열을 사용할 때 유용
        for(int i = 1; i<=n; i++){ // 1~n까지 증가(범위탐색)
            if( i%2 != 0 ){
                arr[index] = i;
                index++;
            }
        }
        
        int[] answer = new int[index];
        for(int i = 0; i < index; i++){ // 배열 복사 범위
            answer[i] = arr[i];
        }
        return answer;
    }
}