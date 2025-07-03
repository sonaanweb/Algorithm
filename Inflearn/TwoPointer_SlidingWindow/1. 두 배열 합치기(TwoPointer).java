package TwoPointers;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * `오름차순 정렬이 된` 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력 O(n)
 * 3 135 (크기 / 배열)
 * 5 23679
 * -> 12335679
 */
public class Two1 {

    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while(p1<n && p2<m){ // AND 사용 -> 유효 범위 비교 (둘 중 하나가 거짓이면 거짓)
            if(a[p1] < b[p2]){  // a[p1]값이 b[p2]보다 작을 때
                answer.add(a[p1++]); // p1 가리키는 값 add 후 포인터 증가(후위)
            }
            else answer.add(b[p2++]);
        }
        // 둘 중 하나의 배열 요소가 남아있는 것 처리
        while(p1<n) answer.add(a[p1++]);
        while(p2<m) answer.add(b[p2++]);

        return answer;
    }

    public static void main(String[] args) {
        Two1 T = new Two1();
        Scanner kb = new Scanner(System.in);
        // a 배열
        int n = kb.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = kb.nextInt();
        }
        // b 배열
        int m = kb.nextInt();
        int[] b = new int[m];
        for (int i=0; i<m; i++) {
            b[i] = kb.nextInt();
        }
        for (int x : T.solution(n, m, a, b)) {
            System.out.print(x + " ");
        }
    }
}


/**
 * 문제의 핵심은 이미 오름차순 정렬된 배열들이라는 것
 * a-  P1 / b- P2 포인터
 * a[p1] < b[p2] 비교 = answer에 차례대로 삽입 정렬(수가 들어간 곳이 주소값 증가 비교)
 * 두 배열의 크기를 받고 입력 받아 병합
 * AND -> 런타임 에러 방지 (한 쪽 배열이 먼저 끝났는데 비교를 시도할 때)
 * nextInt() -> 공백이나 줄바꿈으로 나눠 읽음
 */
