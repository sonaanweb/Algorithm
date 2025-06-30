package Array;

import java.util.Scanner;

/**
 * 등수 구하기
 * 입력 -> N명의 학생(3<=n<=100), 국어 점수 N개
 * 출럭 -> 등수 (동일 점수일 시 같은 등수) : SQL RANK()와 같게 이해함
 */
public class Array8 {

    public int[] solution(int n, int[] arr){
        int[] answer = new int[n];
        for(int i=0; i<n; i++){       // 1. i번째 사람(기준)
            int cnt = 1; // 처음 등수는 1로 시작
            for(int j=0; j<n; j++){   // 2. j번째 사람(i와의 비교 대상)
                if(arr[j] > arr[i]){
                    cnt++;            // 3. i(기준)보다 점수 높은 사람의 수만큼 등수 증가(밀림)
                }
                answer[i] = cnt;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Array8 T = new Array8();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }
        for (int x : T.solution(n,arr)){
            System.out.print(x+" ");
        }
    }
}

/**
 * 크기 고정 int[] 사용
 */
