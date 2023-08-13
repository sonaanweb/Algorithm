class Solution {
    public int[] solution(int[] numbers) {
        // 두배 원소를 담을 배열 선언. numbers 배열 크기와 같이
        int[] answer = new int[numbers.length];
        for(int i=0; i<answer.length; i++){
            answer[i] = numbers[i]*2; // 2배로 저장
        }
        return answer;
    }
}