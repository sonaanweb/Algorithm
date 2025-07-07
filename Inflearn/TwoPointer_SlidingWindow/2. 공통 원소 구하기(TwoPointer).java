package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 두가지의 배열 공통 원소 구하기 - 오름차순
 * 입력
 * 5 - 1 3 9 5 2
 * 5 - 3 2 5 7 8
 * 2 3 5 (출력)
 **/
public class Two2 {

    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(a); // 오름차순 정렬
        Arrays.sort(b);
        int p1 = 0, p2 = 0;     // 탐색 인덱스
        while(p1<n && p2<m){    // 범위 루프
            if(a[p1] == b[p2]){ // 공통 원소 발견!
                answer.add(a[p1++]);
                p2++;
            }
            else if(a[p1] < b[p2]) p1++;    // 정렬되어 있으므로 작은 쪽 증가
            else p2++;
        }
        return answer;
    }

    public static void main(String[] args){
        Two2 T = new Two2();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();   // 1번째 집합
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = kb.nextInt();
        }

        int m = kb.nextInt();   // 2번째 집합
        int[] b = new int[m];
        for(int i=0; i<m; i++){
            b[i] = kb.nextInt();
        }
        for(int x : T.solution(n, m, a, b)){
            System.out.print(x+" ");
        }
    }
}


/**
 * 1. 두 배열 오름차순부터 해줘야함
 * 2. 공통 원소 발생 시 answer에 삽입
 * 3. 비교했을 때 작은 쪽은 포인터 이동 (작은 쪽 증가)
 * ㄴ 작은 쪽을 증가시키는 이유 : 오름차순 정렬을 먼저 했기 때문에, 비교 시 n보다 작은 수가 더이상 나오지 않음
 * 배열 요소 오름차순 정렬 메서드 -> Arrays.sort()
 * 리스트 Collections.sort()
 */
