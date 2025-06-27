package Array;

import java.util.Scanner;

/**
 * A와 B의 가위바위보
 * 1: 가위 / 2: 바위 / 3: 보
 * N번의 게임을 하여 A가 이기면 A 출력, B가 이기면 B출력, 비기면 D 출력
 * 입력
 * 3 첫번째줄
 * 2 3 3 둘(a)
 * 1 1 2 셋(b)
 * 출력
 * 승자: ABA
 */
public class Array4 {

    public String solution(int n, int[] a, int[] b){
        String answer=""; // 최종 출력은 string
        for(int i=0; i<n; i++){
            if(a[i] == b[i]){ // 1. 비길 때
                answer += "D";
            }
            // 2. A가 이기는 경우
            else if((a[i] == 1 && b[i] == 3) ||
                    (a[i] == 2 && b[i] == 1) ||
                    (a[i] == 3 && b[i] == 2)) {
                answer += "A";
            }
            else // 3. B가 이기는 경우
                answer += "B";
        }
        return answer;
    }

    public static void main(String[] args){
        Array4 T = new Array4();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();// 총 게임 수
        int[] a = new int[n]; // 가위바위보 A배열
        int[] b = new int[n]; // 가위바위보 B배열

        // A
        for(int i=0; i<n; i++){
            a[i] = kb.nextInt();
        }

        // B
        for(int i=0; i<n; i++){
            b[i] = kb.nextInt();
        }
        System.out.print("승자: " + T.solution(n, a, b));
    }
}


/**
 * if A == B 비김
 * else if A가 1(가위)로 이기는 경우 B == 3(보)
 * ... A가 2(바위)로 이기는 경우 B == 1(가위)
 * ... A가 3(보)로 이기는 경우 B == 2(바위)
 * else B가 이기는 것
 */


------------------
StringBuilder 사용 솔루션

public String solution(int n, int[] a, int[] b){
    StringBuilder answer = new StringBuilder();
    for(int i = 0; i < n; i++){
        if(a[i] == b[i]) {
            answer.append("D");
        }
        else if((a[i] == 1 && b[i] == 3) ||
                (a[i] == 2 && b[i] == 1) ||
                (a[i] == 3 && b[i] == 2)) {
            answer.append("A");
        }
        else answer.append("B");
    }
    return answer.toString(); // 문자열로 변환해 리턴
}
