package String;

import java.util.Scanner;

/**
 * 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집는 코드
 * a#b!GE*T@S => S#T!EG*b@a
 */
public class String5 {

    public String solution(String str){ // 알파벳만 뒤집기 위해 String sol
        String answer;
        char[] s = str.toCharArray();
        int lt = 0, rt = str.length()-1;
        while (lt < rt){
            if(!Character.isAlphabetic(s[lt]))          // 알파벳이 아니면 넘어감
                lt++;
            else if(!Character.isAlphabetic(s[rt])) rt--;
            else { // 위에 두 조건 다 만족하지 않을 때 교환 후 증감
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s); // 기본 배열 스트링화
        return answer;
    }


    public static void main(String[] args) {
        String5 T = new String5();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }}

/**
 * Character 클래스 isAlphabetic(c) == > true & false
 */
