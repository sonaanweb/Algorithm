package String;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * n개의 단어가 주어지면 각 단어를 뒤집어 출력하는 코드
 * 3 (n)
 * good => doog...
 * time
 * big
 */

// 1. StringBuilder
public class String4 {

    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
            String tmp = new StringBuilder(x).reverse().toString();      // 문자열 x -> Stringbuiler 객체 변환 -> reverse() -> toString 문자열 변환 -> tmp 저장
            answer.add(tmp);
        }
        return answer;
    }


    public static void main(String[] args) {
        String4 T = new String4();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();  // 뒤집을 문자 수
        String[] str = new String[n];
        for (int i=0; i<n; i++){
            str[i] = kb.next();
        }
        for(String x : T.solution(n, str)){
            System.out.println(x); // x = 하나하나의 단어
        }
    }
}



// 2. 직접 뒤집기(문자 배열화, 값 교환)


    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
            char[] s = x.toCharArray(); // 문자 배열화(문자 단위로 접근)
            int lt = 0, rt = x.length()-1;    // lt = 첫번째 문자, rt = 마지막 문자(오른쪽)
            while (lt<rt){
                char tmp = s[lt]; // 임시변수 tmp
                s[lt]=s[rt]; // 값 교환
                s[rt]=tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);  //  valueOf  = static으로 선언 된 클래스 메서드
            answer.add(tmp);
        }

        return answer;
    }





/**
 * toCharArray() char[] 배열 변환 (문자 단위로 접근 조작)
 * String.valueOf() 다양한 타입의 값을 문자열로 변환하는 스트링 클래스 메서드 - null값일 때 null 반환
 */

/**
 * StringBuilder의 이점
 * 가변 객체 - 새로운 객체를 생성하지 않고도 내부 버퍼에서 문자열을 직접 수정할 수 있음
 *
 * ex)
 * String str = "hello";
 * str += "world";  // 새로운 String 객체 생성
 * str += "!!!";     // 다른 String 객체 생성
 *
 * StringBuilder sb = new StringBuilder("hello");
 * sb.append("world");  // 기존 버퍼에서 문자열을 변경
 * sb.append("!!!");     // 새로운 객체 생성 없이 변경
 *
 * 주요 메서드
 * append() 문자열 추가
 * insert() 특정 위치에 문자열 삽입
 * reverse() 문자열 뒤집기
 * delete() 특정 문자열 삭제
 */
