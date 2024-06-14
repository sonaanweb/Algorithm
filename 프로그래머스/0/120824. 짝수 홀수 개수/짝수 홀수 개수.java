class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2]; //인덱스 0(짝),1(홀) 생성
        for(int i = 0; i<num_list.length; i++){ //배열 순회
            if(num_list[i] % 2 == 0){ //짝수일 시
                answer[0]++;
            }else{ // 홀수일 시
                answer[1]++;
            }
        }
        return answer;
    }
}