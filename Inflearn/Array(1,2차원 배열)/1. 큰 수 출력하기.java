package Array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 큰 수 출력하기
 * -> n개의 정수 입력 받고 [배열]
 * 자신의 바로 앞 수보다 큰 수만 출력하는 코드(첫번째 수 무조건 출력)
 * (첫 줄에 자연수 n개 입력, 그 다음 n개의 정수 입력)
 * 6
 * 7 3 9 5 6 12
 * -> 7 9 6 12
 */
public class Array1 {

    public ArrayList<Integer> solution(int n, int[] arr){ // 입력 솔루션
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]); // 첫번째 수 무조건 출력
        for(int i =1; i<n; i++){
            if(arr[i] > arr[i-1]) {
                answer.add(arr[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Array1 T = new Array1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt(); // 첫줄 : n개 정수를 입력할 것이다
        int [] arr = new int[n]; // 두번째 줄 : 배열 생성 (동적 배열)
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt(); // 저장
        }
        for(int x : T.solution(n, arr)){
            System.out.print(x + " ");
        }
    }
}
