package String;

import java.util.Scanner;

/**
 * 대문자 -> 소문자 / 소문자 -> 대문자 출력
 * ex) StuDY -> sTUdy
 */
public class String2 {

    // solution
    public String solution(String str) {
        String answer = "";
        for(char x : str.toCharArray()){
            if (Character.isLowerCase(x))
                answer += Character.toUpperCase(x);

            else answer += Character.toLowerCase(x);
        }
        return answer;
    }

    public static void main(String[] args) {
        String2 T = new String2(); // 클래스 객체 생성 [채점 시에는 Main으로 변경*]
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str)); // 사용자 입력 str 문자열 넘기고 결과 출력
    }
}

/**
 * for(char x : str.toCharArray()) : str 문자열을 char 배열로 변환하여 각 문자에 대해 반복문 수행
 * "StuDY" = ['S', 't', 'u', 'D', 'Y']
 * Character.is(Lower&Upper)Case()) : 대문자 소문자 판별
 */


(2)
  
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); // nextLine : 공백 포함
        StringBuilder sb = new StringBuilder();

        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x)){
                sb.append(Character.toUpperCase(x)); // append() :Builder&Buffer 메서드 문자 하나씩 이어붙임
            }else{
                sb.append(Character.toLowerCase(x));
            }
        }

        System.out.println(sb);
    }
}
