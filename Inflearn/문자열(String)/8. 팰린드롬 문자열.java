package String;

import java.util.Scanner;

/**
 * 팰린드롬(=회문)
 * 단, 회문을 검사할 때 `알파벳`만 회문 검사 + 대소문자 구분x
 * found7, time: study; Yduts; emit, 7douof = YES
 */
public class String8 {

    public String solution(String s){
        String answer = "NO";
        s = s.toUpperCase().replaceAll("[^A-Z]","");
        String tmp = new StringBuilder(s).reverse().toString();
        if (s.equals(tmp))
            answer = "YES";
        return answer;
    }

    public static void main(String[] args) {
        String8 T = new String8();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}


/**
 * foundtimestudyYdutsemitdouof
 */

/**
 * replaceAll() :문자열 대체 메소드 (여러개 필터)
 * [^A-Z],"" 정규식 표현 : A-Z가 `아니면` ^, 없앤다
 */
