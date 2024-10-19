package String;

import java.util.Scanner;

/**
 * 소문자로 된 한개의 문자열이 입력되면 중복 문자를 제거하고, 제거된 문자열의 문자는 원래 순서를 유지
 */
public class Main {

    public String solution(String str){
        String answer = "";
        for(int i = 0; i<str.length(); i++){
            if(str.indexOf(str.charAt(i)) == i){ // 중복이 아닌 문자만 출력
             answer += str.charAt(i);
            }
        }
        return answer;
    }

    public static void Main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}

/**
 * (str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i));
 * i에 위치한 문자   현재문자 인덱스    해당 문자가 처음 등장하는 인덱스
 * 현재 인덱스와 처음 등장하는 인덱스가 다르면 `중복 문자`
 * ksekkset
 * k 0 0
 * s 1 1
 * e 2 2
 * k 3 0 -- 중복
 * k 4 0 -- 중복
 * s 5 1 -- 중복
 * e 6 2 -- 중복
 * t 7 7
 */

/**
 * indexOf() 문자열에서 특정 문자 또는 문자열의 위치(인덱스)를 찾는 메서드 문자열 검사, 문자열 분리 등에 사용
 * String str = "Hello, World";
 * int index = str.indexOf("World");
 * sout(index); == 출력 결과 7
 */
