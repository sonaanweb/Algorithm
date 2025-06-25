package String;

import java.util.Scanner;

/**
 * 암호화 문제
 * 대문자 알파벳 한 문자마다 # or *이 `일곱개`로 구성됨
 * 1. 이진수로 변경 # = 1, * = 0 으로 변환
 * 2. 바뀐 2진수를 10진수화.
 * 3. 아스키 번호 문자 변환, 'A'=65... 해석 프로그램 작성
 * 조건+) 문자 개수 입력, 다음 줄은 신호 입력
 */
public class String12 {
    public String solution(int n, String s){
        String answer = "";
        for(int i=0; i<n; i++){
            String tmp = s.substring(0,7).replace('#','1').replace('*','0'); // 0번 인덱스부터 6번 인덱스
            int num = Integer.parseInt(tmp, 2); // 정수화
            answer += (char)num;
            s = s.substring(7); // 7부터 끝까지
        }
        return answer;
    }

    public static void main(String[] args){
        String12 T = new String12();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next(); // 문자열 스트링 받기
        System.out.println(T.solution(n,str));
    }
}

// parseInt(문자열, n) -> 문자열을 n진수로 읽어 정수로 변환한다는 뜻
