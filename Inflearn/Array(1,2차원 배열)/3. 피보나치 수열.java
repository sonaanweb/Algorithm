package Array;

import java.util.Scanner;

/**
 * 앞의 2개의 수를 합하여 다음 숫자가 되는 수열
 * 입력: 첫 줄에 총 항수 N(3<=...) 입력
 * 출력: 피보나치 수열 출력
 * 10
 * 1 1 2 3 5 8 13 21 34 55
 * * 해당 문제에선 앞에 두 수를 1 1 로 고정하기로 한다
 */
public class Array3 {

    public int[] solution(int n){
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;
        for(int i=2; i<n; i++){ // 0,1 배열은 정해져있으므로 배열 인덱스 2부터 시작
            answer[i] = answer[i-2] + answer[i-1]; // 앞에 두 수 합
        }
        return answer;
    }

    public static void main(String[] args){
        Array3 T = new Array3();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt(); // 입력
        for(int x : T.solution(n)){ // 출력
            System.out.print(x + " ");
        }
    }
}


/** ----- 헷갈리고 실수하던 것 -----
 * ArrayList<Integer> -> 동적 배열. 결과 개수를 알 수 없을 때.
 * 요소의 삽입과 삭제가 자주 일어날 때 사용 .add .remove 등 메서드 지원
 * int[] -> 고정(길이 지정 필요)
 * 결과 크기가 고정되어 있을 때 (n개 입력 받아 그대로 처리함), 인덱스 기반 접근 시
 */
