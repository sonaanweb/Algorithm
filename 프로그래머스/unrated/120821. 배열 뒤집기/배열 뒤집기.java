class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];// 배열 크기(길이)만큼 생성
        int index = 0; // 인덱스 변수 초기화 - 배열 순서 추적하기 위함

        // 반복을 배열의 끝 인덱스부터 시작 (i-- : 후위 감소 연산자)
        for (int i = num_list.length - 1; i >= 0; i--) {
            answer[index] = num_list[i];
            index++;
        }
        return answer;
    }
}