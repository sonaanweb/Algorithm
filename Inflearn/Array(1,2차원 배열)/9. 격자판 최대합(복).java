package Array;

import java.util.Scanner;

/**
 * 격자판의 합 - N * N 의 격자판이 주어지면 각 행의 합, 열의 합, 두 대각선의 합 중 가장 큰 합 출력
 * 첫 줄에 자연수 N (2<=n<=50)
 * 두번째 줄 부터 N줄에 걸쳐 각 줄에 N개의 자연 수 (각 자연수는 100을 넘지 않음)
 * 출력-> 최대합 출력
 */
public class Array9 {

    public int solution(int n, int[][] arr){    // 정적 2차원 배열 필요
        int answer = Integer.MIN_VALUE;
        int sum1, sum2;     // sum1 = 행의 합, sum2 = 열의 합
        for(int i=0; i<n; i++){
            sum1 = sum2 = 0;
            for(int j=0; j<n; j++){
                sum1 += arr[i][j];  // 행(i) 고정
                sum2 += arr[j][i];  // 열(j) 고정
            }
            answer = Math.max(answer, sum1);    // 둘 중 큰 값 넣음
            answer = Math.max(answer, sum2);
        }
        sum1 = sum2 = 0;
        for(int i=0; i<n; i++){
            sum1 += arr[i][i];  // 대각선 합(왼->오아래 방향) => 행과 열 번호가 같은 것들
            sum2 += arr[i][n-i-1];  // 대각선 합(오->왼아래 방향)
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);
        return answer;
    }

    public static void main(String[] args) {
        Array9 T = new Array9();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.print(T.solution(n, arr));
    }

}



/**
 5
 10 13 10 12 15
 12 39 30 23 11
 11 25 50 53 15
 19 27 29 37 27
 19 13 13 13 19
 155
 */
