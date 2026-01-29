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
                    ch[j] = 1; // i의 배수들 ch[]배열에 체크함(소수 X)
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




// -------------------------------------------------------------------------------------------------------

// ✅ 소수의 배수 제거 (i*i부터 시작 → 이미 처리된 배수 제외 방법(중복 체크 제거))
public class Array5_1 {

    public int solution(int n){
        int answer = 0;
        int[] ch = new int[n+1]; // 인덱스 번호는 n번까지 필요함
        for(int i=2; i<=n; i++){
            if(ch[i] == 0){
                // System.out.print(i + " "); 확인 코드
                answer++; // 0으로 표시되어있으면 카운팅
            }
            // 소수 제외는 1로 표시
            for(int j=i*i; j<=n; j=j+i){ // 위에서 이미 소수를 체크했으므로 중복 제거 i*i부터 돈다. + j는 i씩 증가하여 배수 체크 1로
                ch[j] = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Array5_1 T = new Array5_1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        // System.out.print("= " + T.solution(n) + "개") ;
        System.out.print(T.solution(n));
    }
}




/*
초기 ch = [0,0....] 모두 0으로 초기화 됨
 i = 2 → ch[2] == 0 → 소수
 → answer = 1
 → 2,4,6,8,10 → ch[2]=2, ch[4]=2...
 */
