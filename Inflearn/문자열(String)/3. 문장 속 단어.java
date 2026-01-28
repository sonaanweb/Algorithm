package String;

import java.util.Scanner;

/**
 * 문장 속 단어
 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 코드를 작성하시오.
 * 문장 속 단어는 `공백`으로 구분
 * if 가장 길이가 긴 단어가 여러개일 경우 문장 속에서 `가장 앞쪽(끝)에 위치한 단어` 출력
 */
public class Main {

  // 1. indexOf 풀이
    public String solution(String str){
        String answer="";
        int m = Integer.MIN_VALUE, pos; // pos = 특정 문자 인덱스 저장 변수
        while ((pos = str.indexOf(' ')) != -1){ // 공백을 찾고 공백이 없을 때 반복 종료
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if(len > m){ // 현재 단어 길이가 가장 긴 단어의 길이보다 크면 업데이트
                m = len;
                answer = tmp;
            }
            str = str.substring(pos+1); // +1 공백 다음부터 문자열 자름
        }
        if(str.length()>m) answer = str; // 반복문 종료 시 남아있는 단어 확인
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine(); // nextLine (문장)
        System.out.println(T.solution(str));
    }
}




// 2. split 풀이
public class Main {

    public String solution(String str){
        String answer="";
        int m = Integer.MIN_VALUE; // 정수형 최소값 초기화 -- 초기에는 항상 m보다 크므로 첫번째 단어 길이로 대체
        String[] s = str.split(" "); // split 구분자 " " = 공백기준으로 문자열 나누어 배열로 반환
        for(String x : s){ // 배열 s의 단어 x를 반복하여 탐색
            int len = x.length(); // x의 길이 저장
            if(len > m){  // 각각의 단어의 길이가 최소값 보다 크면, 해당 값을 최소값으로 설정하고 해당 단어를 반환 할 변수에 담는다
                m = len;
                answer = x; // 긴 단어 업데이트
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine(); // nextLine (문장)
        System.out.println(T.solution(str));
    }
}


// 3. max 사용으로 가독성 올리기 추가 풀이 ✅

public class WordInSentence {

    public String solution(String str) {
        String answer = "";
        int max = 0; // 길이

        String[] words = str.split(" ");
        for(String x : words){
            if (x.length() > max){ // ex) 4 > 4 변화 없어서 문제 사항 조건 만족
                max = x.length();
                answer = x;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        WordInSentence T = new WordInSentence();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine(); // 각 단어가 공백으로 나누어져 있으므로 공백도 스캔
        System.out.println(T.solution(str));
    }
}



/**
 * 1. Split : 표현식, 특정 문자를 기준으로 문자열을 나누어 배열 반환
 * String[] s = str.split(" ");
 * ex) i want to go home
 * [] = "i", "want", "to", "go", "home" 배열 저장
 *
 * 2. indexOf(String) : 주어진 문자열에서 특정 문자열(문자)가 처음으로 등장하는 인덱스 반환, 찾지 못하면 -1
 * String str = "i want to go home";
 * int num = str.indexOf(" ");
 * System.out.println(num);  // 출력: 1
 *
 * String str = "i want to go home";
 * int num = str.indexOf("go");
 * System.out.println(num);  // 출력: 10 [처음 시작 인덱스 반환]
 *
 * 단, indexOf는 대소문자를 구분한다.
 *
 * 3. substring() : 문자열을 원하는 위치에서 잘라야 할 때 사용
 * substring(int beginIndex) = beginIndex부터 끝까지의 부분 문자열 반환
 * substring(int beginIndex, int endIndex) = beginIndex부터 endIndex 이전까지의 부분 문자열을 반환 (endIndex는 포함되지 않음.)
 * String str = "ABCDEFG";
 * str.substring(3) == DEFG
 * str.substring(3,5) == DE
 */

/*
메서드 실행 과정 예시
주어진 문자열: i love study
ps = str.indexOf(' '); // pos = 1 (첫번째 공백 인덱스)
String tmp = str.substring(0, pos); // tmp = "i" 저장 (0,1미만)
int len = tmp.length(); // len = 1
if(len > m){   // 1 > Integer.MIN_VALUE => true
   m = len; // m = 1
   answer = tmp; // answer = "i"
}
str = str.substring(pos + 1); // str = "love study" ("i " 이후의 문자열) - 공백 이후
*/
