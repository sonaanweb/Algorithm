package String;

import java.util.Scanner;

/**
 * 문자와 숫자가 섞여있는 `문자열`이 주어지면 그 중 숫자만 출력하여 순서대로 자연수를 만든다.
 */
public class String9 {

    public int solution(String s){          // 최종적으로 정수 반환이므로 int 선언
        String answer = "";
        for(char x : s.toCharArray()){
            if(Character.isDigit(x)){   // x가 숫자면
                answer += x;
            }
        }
        return Integer.parseInt(answer);    // 스트링화 되어있는 것을 정수형으로 변환
    }

    public static void main(String[] args) {
        String9 T = new String9();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}


/**
 * 숫자        0 | 1  | 2  | 3  | 4  | 5  | 6  | 7  | 8  | 9
 * ASCII(A)   48 | 49 | 50 | 51 | 52 | 53 | 54 | 55 | 56 | 57
 * (A-48) = 숫자를 문자로 입력받았을 때 이를 숫자로 변환하기 위한 알고리즘
 */

/**
 *     public int solution(String s){
 *         int answer = 0;
 *         for(char x : s.toCharArray()){
 *             if(x>=48 && x<=57)          // 숫자 범위
 *                 answer = answer * 10 + (x-48);   // *10을 이용해 자릿수 올림
 *         }
 *         return answer;
 *     }
 */

/**
 * Character.isDigit() : 주어진 문자가 숫자인지 확인하는 메서드 숫자 (0~9)에 해당하는 문자인 경우 true
 */
