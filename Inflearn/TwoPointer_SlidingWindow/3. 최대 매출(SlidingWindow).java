package TwoPointers;

import java.util.Scanner;

/**
 * 최대 매출 - N일 동안의 매출 기록을 주고, K일 동안의 최대 매출액이 얼마인지 구하는 문제
 * N = 10 (열흘) , K = 3 (연속 3일)
 * 12 15 (11 20 25) 10 20 19 13 15 -> 연속 3일간의 기록 중 최대 매출액 구하기
 */
public class Sliding1 {
    public int solution(int n, int k, int[] arr){   // 매출 합만 출력 int
        int answer = 0, sum = 0;    // answer: 최대 매출 합 저장 변수, sum: 현재 슬라이딩 윈도우 내 매출 합
        for(int i=0; i<k; i++){     // 0 < 3 -> 0,1,2 (3일)
            sum += arr[i];
            answer = sum;           // 윈도우 합 계산
        }
        for(int i=k; i<n; i++){     // 최대 합 갱신 루프. 윈도우 한 칸씩 이동. i=k인 이유는 이미 슬라이딩 1. for에서 첫번째 윈도우 계산 완료
            sum += (arr[i] - arr[i-k]); // sum = 이전 sum + 새로 들어온 값 - 빠져나간 값
            answer = Math.max(answer, sum); // 최대 값 갱신
        }
        return answer;
    }

    public static void main(String[] args){
        Sliding1 T = new Sliding1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt(); // n일
        int k = kb.nextInt(); // 연속 k일(고정) 입력
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }
        System.out.print(T.solution(n, k, arr));
    }

}



/**
 * Sliding Window - 고정된 사이즈의 [윈도우]를 이동시켜 문제를 푸는 알고리즘
 * 배열이나 리스트 요소의 일정 범위 값을 비교할 때 사용하기 유용함. (구간 합, 부분 문자열)
 *
 * 투포인터 -> 구간의 넓이가 유동적으로 변함
 * 슬라이딩 -> 구간의 넓이가 고정
 *
 * 두 가지의 공통점
 * 선형 공간을 2회 이상 반복적으로 탐색해야 할 경우
 * O(n^2) 이상 걸릴 시간 복잡도를 부분 배열을 활용해 O(N)으로 줄일 수 있다
 */
