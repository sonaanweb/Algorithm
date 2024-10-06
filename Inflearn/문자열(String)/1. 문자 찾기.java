package String;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 문자 개수 출력 변수
        int answer = 0;

        Scanner in = new Scanner(System.in); // 입력 스캐너
        String input1 = in.next().toUpperCase(); // 1. 입력 `문자열`
        char input2 = in.next().charAt(0); // 2. 찾을 특정 `문자` 입력 - 0번에 있는 문자
        input2 = Character.toUpperCase(input2);

        // 입력한 문자열 전체 순회하고 count
        for(int i = 0; i < input1.length(); i++){
            if(input1.charAt(i) == input2)
                answer ++;
        }
        System.out.println(answer);
    }
}

/**
 * Scanner(System.in) 입력 스캐너
 * String 문자열, char 단어
 * next() 문자열을 `단어 단위`로 읽음 / 공백&줄바꿈 포함 문자열을 읽을 땐 nextLine()
 * CharAt() 특정 인덱스[0---]에 위치한 단일문자 반환
 * 대소문자 구분 없게 toUpperCase  or  toLowerCase
 */


// ---- 백준 방식 아래 [Solution] ----
package String;

import java.util.Scanner;

public class Main {
    public int solution(String str, char t){ // 입력 매개변수
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
      
        // 향상 된 for문 방식
        for(char x : str.toCharArray()){ // 스트링을 문자 배열로 toCharArray
            if(x==t){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.print(T.solution(str,c)); // 솔루션 호출
    }
}



package String;

import java.util.Scanner;

public class Main {
    public int solution(String str, char t){ // 입력 매개변수
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == t)
                answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.print(T.solution(str,c));
    }
}



