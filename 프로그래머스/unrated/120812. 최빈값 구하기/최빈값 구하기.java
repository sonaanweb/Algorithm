class Solution {
    public int solution(int[] array) {
        // 배열이 매개변수로 주어졌을 때 최빈값 리턴
        int answer = 0; // 최빈값
        int arrMax = 0; // 담겨있는 값 중 가장 큰 수
        
        //인덱스 범위를 벗어나는 에러를 유의하기 위해 length 사용
        for(int i = 0; i < array.length; i++){ 
            if(array[i] > arrMax){
                arrMax = array[i];
            }
        }
        // 개수 배열 생성
        int[] count = new int[arrMax + 1];
        int max = 0;
        
        for (int i = 0; i < array.length; i++){
            count[array[i]]++;
        }
        //count[a] == b; a가 b개
        
        // 최빈값
        // 각 수의 최대 횟수를 count 배열에 담는다
        for (int i = 0; i < count.length; i++){
            if(count[i] > max){
                max = count[i];
                answer = i; // answer = 입력된 수
            }
        }
        
        int n = 0;
        
        // 최빈값 중복 확인
        for (int i = 0; i<count.length; i++){
            if(count[i] == max){ //최대값이 존재한다면
                n++; // +1
            }
        }
        
        if(n>1)
            answer = -1;
        
        return answer;
    }
}