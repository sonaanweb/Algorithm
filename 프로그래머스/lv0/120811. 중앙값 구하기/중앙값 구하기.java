import java.util.Arrays; // array import (이클립스에선 자동으로 추가 됨)

class Solution {
    public int solution(int[] array) {
        // array의 길이는 홀수라 가정
        // array.sort
        int answer = 0;
        Arrays.sort(array);
        // Array.sort(); 기본 오름차순 정렬 메서드
        // array[(배열의길이-1)/2 = 중앙값 위치];
        // ex 배열의 길이 5(-1) / 2 = 2번째 인덱스가 중앙값
        answer = array[array.length/2];
        return answer;
 
    }
}