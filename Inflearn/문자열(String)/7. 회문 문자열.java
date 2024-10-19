package String;

import java.util.Scanner;

/**
 * 앞/뒤에서 읽을 때 같은 문자열 = 회문 문자열
 * 회문 문자열이면 YES 출력, 아니면 NO 출력
 * 대소문자 구분하지 않음
 */
public class String7 {

    public String solution(String str){
        str = str.toUpperCase();    // 대소문자 구분하지 않기 위해 지정
        String answer = "YES";      // 기본값 YES로 가정
        int len = str.length();
        for(int i = 0; i<len/2; i++){
            if(str.charAt(i) != str.charAt(len-i-1)){ // i >> << len 방향
                return "NO";
                                      //answer = "NO"; break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String7 T = new String7();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}



/* StringBuilder 솔루션

        public String solution(String str){
            String answer = "NO";
            String tmp = new StringBuilder(str).reverse().toString();   // 뒤집은 문자 저장
            if(str.equalsIgnoreCase(tmp))       // str = tmp가 같으면 회문
                                                // equalsIgnoreCase 문자열 비교시 대소문자 무시
                answer = "YES";
                return answer;
        }
*/



/**01 | 23 = len / 2 (짝수/ 홀수 같음)
 * go | og
 *
 * 길이와 비교한다는 것을 유의
 * g    o    o     g
 i 0    1    2     3
 l              (len-i-1)해야 같아짐 (4-0-1)
 */

/**
 * equalsIgnoreCase() : String 클래스 메서드
 * 1. equals() : 대소문자 구분 비교
 * 2. equalsIgnoreCase() : 대소문자 구분 X
 */
