package Array;

import java.util.Scanner;

/**
 * OX 문제. 1(정답)이 연속될 때 누적 가산
 * 입력 -> 문제 개수 (1<=n<=100), 채점 결과 0(오답) 1(정답)
 * 출력 -> 점수
 */
public class Array7 {

    public int solution(int n, int[] arr){
        int answer = 0, cnt = 0; // answer -> 누적(최종 점수) & cnt -> 연속 개수 계산
        for(int i=0; i<n; i++){
            if(arr[i] == 1){ // 인덱스 값 1 (정답)일 때
                cnt++;
                answer += cnt;
            }
            else cnt = 0;
        }
        return answer;
    }

    public static void main(String[] args){
        Array7 T = new Array7();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt(); // 10
        int[] arr = new int[n]; // 동적 배열
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt(); // 1011..
        }
        System.out.print(T.solution(n, arr));
    }
}


/**
 * i | arr[i] | cnt(1 연속 개수) | answer(총 점수)
 * 0 | 1      | 1              | 1
 * 1 | 0      | 0 (초기화)      | 1
 * 2 | 1      | 1              | 2
 * 3 | 1      | 2              | 4
 * 누적 가산 점수가 아니라면 그냥 answer++;
 * 총점 하나만 구하면 되므로 int solution (리턴값이 무엇이냐를 한 번 더 생각)
 */
