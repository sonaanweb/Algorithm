package TwoPointers;

import java.util.Scanner;

/**
 * O(n^2) -> O(n)
 * N개의 수로 이루어진 수열
 * 연속 부분 수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지
 * N = 8 (수 개수) , M = 6 (합)
 * 1 2 1 3 1 1 1 2 -> {2,1,3}, {1,3,1,1}, {3,1,1,1} = 총 3가지
 */
public class Mixed1 {

    public int solution(int n, int m, int[] arr){
        int answer = 0, sum = 0, lt = 0;
        for(int rt=0; rt<n; rt++){  // rt 증가
            sum += arr[rt]; // lt 부터 rt까지의 합
            if(sum == m) answer++; // sum이 m과 같으면 카운팅 (확인)
            while(sum >= m){
                sum -= arr[lt++];   // lt 값 빼고 나서 증가
                if(sum == m) answer++;  // sum이 m과 같으면 카운팅 (확인)
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Mixed1 T = new Mixed1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }
        System.out.print(T.solution(n, m, arr));
    }
}
