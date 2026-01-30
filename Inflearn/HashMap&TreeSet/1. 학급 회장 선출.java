package Hash;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 학급회장 선출 - 빈도수 세기
 */
public class Hash {

    public char solution(int n, String str){
        char answer=' ';
        HashMap<Character, Integer> map = new HashMap<>(); // key, value
        for(char x : str.toCharArray()){
            map.put(x, map.getOrDefault(x, 0)+1); // x 키 값 가져오되 없으면 0 리턴 + 1
        }
        int max = Integer.MIN_VALUE;
        for(char key : map.keySet()){ // 키 탐색 keySet, value 값 get
            // System.out.println(x+" "+map.get(x));
            if(map.get(key) > max){
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }


    public static void main(String[] args){
        Hash T = new Hash();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(n, str));
    }
}

/**
 * map.put(key, value);        // Key, value 추가 또는 수정
 * map.get(key);               // 키 값 가져오기
 * map.getOrDefault(key, 0);   // 없으면 기본값(0 설정) 반환
 * map.containsKey(key);       // 키 존재 여부 true/false
 * map.remove(key);            // 키 삭제
 * map.size();                 // 맵 크기
 * map.keySet();               // 모든 키 탐색
 */
