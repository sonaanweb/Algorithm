class Solution {
  
// numbers_len은 배열 numbers의 길이입니다.
// numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요
    public double solution(int[] numbers) {
         double answer = 0;

        for(int i = 0 ; i < numbers.length ; i++){
            answer += numbers[i];
        }

        return answer/numbers.length;
    }
}
