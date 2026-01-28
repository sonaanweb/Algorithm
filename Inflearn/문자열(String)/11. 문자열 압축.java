package String;

import java.util.Scanner;

/**
 * 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우,
 * 반복되는 문자 오른쪽에 횟수를 표기한다. 단, 반복횟수가 1인 경우는 생략
 */
public class String11 {

    public String solution(String s) {                  // 입력 받은 문자열 String 처리
        String answer = "";
        s = s + " ";            // 인덱스 범위 오류 방지 : 마지막 문자까지 비교하기 위함
        int cnt = 1;            // 인덱스 번호(X) 카운트할 때 첫번째 지점에는 반드시 문자가 하나 있으므로 1로 초기화
        for(int i = 0; i<s.length()-1; i++){    // 인덱스 기준이기 때문에 범위는 length-1
            if(s.charAt(i) == s.charAt(i+1)){   // i = i+1 지점의 문자가 같으면
                cnt++;
            } else{
                answer+=s.charAt(i);    // 문자 자체 answer에 무조건 추가
                if(cnt > 1)
                    answer += String.valueOf(cnt);  // 스트링화시켜서 출력 ex)K2..
                cnt = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String11 T = new String11();
        Scanner kb = new Scanner(System.in);
        String str = kb.next(); // 문자열
        System.out.println(T.solution(str));
    }
}



// StringBuilder 방법 추가 풀이 ✅

public class Main {

    public String solution(String str){
        StringBuilder answer = new StringBuilder(); // 정답 상자
        str = str + " ";
        int cnt = 1; // 1부터 시작
        for (int i = 0; i < str.length() - 1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                cnt++; // 1. 앞 뒤 같을 시 증가
            } else { // 2. 다른 문자 시작 (지금까지 모은 것 출력)
                answer.append(str.charAt(i));

                if(cnt > 1){ // 3. 1 이상인 것은 cnt 같이 출력
                    answer.append(cnt);
                }
                cnt = 1; // 4. cnt 초기화
            }
        }
        return answer.toString(); // StringBuilder == toString 잊지 말기
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
