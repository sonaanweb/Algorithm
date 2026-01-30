package Hash;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 아나그램 : 두 문자열 알파벳 나열 순서는 다르지만, 구성이 일치한 단어
 * 길이가 같은 두 개의 단어가 주어지면, 두 단어가 아나그램인지 판별하는 코드 작성 (* 대소문자 구분)
 * 출력 시 아나그램이면 YES, or No
 */
public class Hash2 {

    public String solution(String a, String b){
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        // 1. HashMap에 첫번 째 문자 수 카운팅
        for(char x : a.toCharArray()){
            map.put(x, map.getOrDefault(x,0)+1);
        }
        // 2. 두 번째 문자열 탐색하면서 Key가 있는 지 탐색하고 존재하면 감소 -> 3. 모두 다 0되면 아나그램
        for(char x : b.toCharArray()){
            if(!map.containsKey(x) || map.get(x) == 0){ // 아나그램 판별
                return "NO";
            }
            map.put(x, map.get(x)-1); // 존재하므로 1 감소
        }
        return answer;
    }

    public static void main(String[] args){
        Hash2 T = new Hash2();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        String b = kb.next();
        System.out.print(T.solution(a,b));
    }
}
