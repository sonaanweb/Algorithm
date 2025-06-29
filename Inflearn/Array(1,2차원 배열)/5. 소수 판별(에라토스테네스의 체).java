package Array;

import java.util.Scanner;

/**
 * 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램
 * 입력 -> 자연수의 개수 N(2<=N<=200000)
 * ex) 입력 20 -> 2, 3, 5, 7, 11, 13, 17, 19 (출력: 8)
 * 에라토스테네스의 체 - 소수 판별 알고리즘
 */
public class Array5 {

    public int solution(int n){
        int answer = 0;
        int[] ch = new int[n+1]; // 인덱스 번호 n번까지 생겨야 함
        for(int i=2; i<=n; i++){ // 1은 소수가 아니므로 제외
            if(ch[i] == 0){ // 소수 체크
                answer++;
                for(int j=i; j<=n; j=j+i){ // 소수가 아닌 것
                    ch[j] = i; // i의 배수들 ch[]배열에 체크함(소수 X)
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Array5 T = new Array5();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt(); // 숫자 읽고
        System.out.println(T.solution(n)); // 솔루션에 n 넘김
    }
}


/*
초기 ch = [0,0....] 모두 0으로 초기화 됨
 i = 2 → ch[2] == 0 → 소수
 → answer = 1
 → 2,4,6,8,10 → ch[2]=2, ch[4]=2...
 */
