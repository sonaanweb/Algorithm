package String;

import java.util.Scanner;

/**
 * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 `문자 t`와 떨어진 `최소거리`를 출력하는 코드
 */
public class Main {

    public int[] solution(String s, char t){
        int[] answer = new int[s.length()];
        int p = 1000;   // 범위
        for(int i = 0; i<s.length(); i++){
                    // 1. 왼쪽 기준
            if(s.charAt(i) == t){   // t면
                p = 0;              // 0
            } else {                // t 아니면
                p++;                // 1씩 증가
            }
            answer[i] = p;
        }
                    // 2. 오른쪽 기준
        p = 1000;
        for(int i =s.length()-1; i>=0; i--){    // 인덱스 길이 *
            if(s.charAt(i) == t){
                p = 0;
            } else{
                p++;
                answer[i] = Math.min(answer[i], p); // 값 비교 작은 값
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next(); // 문자열
        char c = kb.next().charAt(0); //문자 하나
        for(int x : T.solution(str, c)){
            System.out.print(x+" ");
        }
    }
}


/**
 * teachermode e : e 로부터 떨어진 거리 라는 것
 * 1. (왼쪽 e 기준 거리) = 왼쪽에 e 없으면 +1 즉, (e면 0, 아니면 +1) 방향 --->
 * 2. (오른쪽 e 기준 거리) = 오른쪽에 e 없으면 +1 즉, (e면 0, 아니면 +1) 방향 <---
 * for문 돌 때 기존 값과 비교하여 작은 값이 들어감 (최소값 출력이므로)
 */
