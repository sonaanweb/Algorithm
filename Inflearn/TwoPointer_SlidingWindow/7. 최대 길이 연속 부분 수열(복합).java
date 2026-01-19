package TwoPointers;

import java.util.Scanner;

/**
 * 0과 1로 구성된 길이가 N인 수열이 주어진다.
 * 0을 1로 최대 k번까지 1로 바꿀 수 있을 때, 1로만 이루어진 가장 긴 연속 부분 수열의 길이를 구하는 프로그램
 ex) 14 / 2 / 1 1 0 0 [1 1 0 1 1 0 1 1] 0 1
 */
public class Two5 {

    public int solution(int n, int k, int[] arr) {
        int answer = 0, cnt = 0, lt = 0; // cnt = 0 -> 1로 변경한 수
        for (int rt = 0; rt < n; rt++) { // rt 포인터 하나씩 이동하며 확장
            if (arr[rt] == 0) cnt++;
            while (cnt > k){ // 변경한 개수가 주어진 k번 보다 많아지면 안 된다
                if(arr[lt] == 0) cnt--; // 왼쪽 끝을 줄여 구간 감소 -> 빠지는 값이 0이면 cnt 감소
                lt++;
            }
            answer = Math.max(answer, rt-lt+1); // 길이 갱신
        }
        return answer;
    }

    public static void main(String[] args){
        Two5 T = new Two5();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, k, arr));
    }
}
