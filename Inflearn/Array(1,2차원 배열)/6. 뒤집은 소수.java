package Array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * n개의 자연수가 입력되면 각 자연수를 뒤집은 후 뒤집은 수가 소수일 시 출력
 * 첫줄에 자연수 개수 N(3<=n<=100), 그 다음줄에 자연수 N개가 주어짐
 * ex) 입력 9 / 32 55 62 20 250 370 200 30 100
 * 출력-> 23 2 73 2 3
 */
public class Array6 {

    // 소수 판별
    public boolean isPrime(int num) {
        if(num == 1) { // 1은 소수가 아님(예외)
            return false;
        }
        for(int i=2; i<num; i++){ // 1은 제외, 2부터
            if(num % i == 0) return false; // 나눠지면 소수 아님
        }
        return true; // 소수 true
    }

    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<n; i++){
            int tmp = arr[i];
            int res = 0;
            while(tmp>0){
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }
            if(isPrime(res)) answer.add(res);
        }
        return answer;
    }

    public static void main(String args[]){
        Array6 T = new Array6();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt(); // n 받고
        int[] arr = new int[n]; // 길이 배열 받음 -> 솔루션에 넘기기 위함
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }
        for(int x : T.solution(n, arr)){
            System.out.print(x+" ");
        }
    }
}


/*
 * 이해가 필요했던 부분 [동작 흐름]
 * 1. 숫자 총 N개 / N개 각각 입력 -> 2. 각 숫자 뒤집음 -> 3. 소수 확인
 * 4. 소수일 시 결과 리스트에 저장 -> 5. 출력
 *
 * 솔루션 알고리즘은 오른쪽 끝에서부터 한 글자씩 잘라 이어 붙인다 생각하는 것이 좋음
 * 0 * 10 + 3  | 3	| 123 → 12
 * 3 * 10 + 2  | 32	| 12 → 1
 * 32 * 10 + 1 | 321| 1 → 0 (끝)
 *
 * 즉, %10 -> 숫자의 끝자리만 떼어내고
 * res = res * 10 + 끝자리 -> 지금까지 만들어진 숫자의 뒤에 이어 붙이기 위함
 * / 10 -> 숫자 한 자리 줄여서 앞자리로 이동
 */
