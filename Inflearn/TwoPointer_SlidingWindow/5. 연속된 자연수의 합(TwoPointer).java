package TwoPointers;

import java.util.Scanner;

/**
 * N입력으로 양의 정수 N이 입력되면 `2개 이상의 연속된` 자연수의 합으로
 * N을 표현하는 방법의 `가짓수` 출력 프로그램
 * N = 15 (15/2) --- N 나누기 2 의 값보다 큰 자연수는 필요 없음(연속 시 초과)
 * 7 + 8 = 15..... 등등의 경우 수
 */
public class Two3 {

    public int solution(int n){
        int answer = 0, sum = 0, lt = 0;
        int m = n/2 + 1;        // 사용 숫자의 범위 (최대값)
        int[] arr = new int[m]; // n/2까지의 자연수들을 담기 위한 배열
        for(int i=0; i<m; i++) arr[i] = i+1; // 0번 인덱스에 1.. => arr[m-1] = m
        for(int rt=0; rt<m; rt++){
            sum += arr[rt];
            if(sum == n) answer ++; // 누적합이 n과 같으면 경우의 수 1 증가
            while(sum >= n){
                sum -= arr[lt++];
                if(sum == n) answer ++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Two3 T = new Two3();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.print(T.solution(n));
    }
}


/**
 * 1,2,3,4 ... N/2 + 1 -> 그 이상은 합이 N을 넘음
 * 두 포인터 lt, rt를 생성해 합을 유지하면서 합이 N이면 answer 증가시키고(= 가짓 수)
 * N보다 작으면 rt를 늘림 (오른쪽으로 확장), N보다 크면 lt를 늘림(왼쪽 축소)
 */
